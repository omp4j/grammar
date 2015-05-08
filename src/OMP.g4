grammar OMP;

// PARSER RULES
ompUnit : OMP (
                ompParallel    |
                ompParallelFor |
                ompFor         |
                ompSections    |
                ompSection     |
                ompSingle      |
                ompMaster      |
                ompBarrier     |
                ompAtomic      |
                ompCritical    |
                ompThreadNum   |
                ompNumThreads
               ) EOF ;

ompParallel
    locals [static java.util.HashSet<String> names]
    @init {
        OmpParallelContext.names = new java.util.HashSet<String>();
    }
    : PARALLEL ompParallelModifiers ;

    ompParallelModifiers
        : ompParallelModifier ompParallelModifiers
        |
        ;

    ompParallelModifier
        // Ensure that no duplicates have been provided
        // schedule, threadNum and accessModifiers
        : {!$ompParallel::names.contains("schedule")}?  ompSchedule {$ompParallel::names.add("schedule");}
        | {!$ompParallel::names.contains("threadNum")}? threadNum   {$ompParallel::names.add("threadNum");}
        | ompAccessModifier
        ;

ompParallelFor
    locals [static java.util.HashSet<String> names]
    @init {
        OmpParallelForContext.names = new java.util.HashSet<String>();
    }
    : PARALLEL FOR ompParallelForModifiers ;

    ompParallelForModifiers
        : {$ompParallelFor::names.size() < 3}? ompParallelForModifier ompParallelForModifiers
        | {$ompParallelFor::names.size() <= 3}?
        ;

    ompParallelForModifier
        // Ensure that no duplicates have been provided
        // schedule, threadNum and accessModifiers
        : {!$ompParallelFor::names.contains("schedule")}?  ompSchedule {$ompParallelFor::names.add("schedule");}
        | {!$ompParallelFor::names.contains("threadNum")}? threadNum   {$ompParallelFor::names.add("threadNum");}
        | ompAccessModifier
        ;

ompSections
    locals [static java.util.HashSet<String> names]
    @init {
        OmpSectionsContext.names = new java.util.HashSet<String>();
    }
    : SECTIONS sectionsModifiers ;

    sectionsModifiers
        : {$ompParallelFor::names.size() < 2}? sectionsModifier sectionsModifiers
        | {$ompParallelFor::names.size() <= 2}?
        ;

    sectionsModifier
        // Ensure that no duplicates have been provided
        // schedule and threadNum
        : {!$ompParallelFor::names.contains("schedule")}?  ompSchedule {$ompParallelFor::names.add("schedule");}
        | {!$ompParallelFor::names.contains("threadNum")}? threadNum   {$ompParallelFor::names.add("threadNum");}
        ;


ompFor          : FOR ompAccessModifier*       ;
ompSection      : SECTION                      ;
ompSingle       : SINGLE                       ;
ompMaster       : MASTER                       ;
ompBarrier      : BARRIER                      ;
ompAtomic       : ATOMIC                       ;
ompCritical     : CRITICAL ( '(' ompVar ')' )? ;

ompThreadNum    : OMPTHREADNUM  ;
ompNumThreads   : OMPNUMTHREADS ;

ompPublic       : PUBLIC       ;
ompPrivate      : PRIVATE      ;
ompFirstPrivate : FIRSTPRIVATE ;

ompSchedule       : SCHEDULE '(' ( . )*? ')'                          ;
threadNum         : THREAD_NUM '(' ompNumber ')'                                   ;
ompAccessModifier : ( ompPublic | ompPrivate | ompFirstPrivate ) '(' ompVars ')'   ;

ompVars   : ( ompVar | ( ompVar ',' )+ ompVar ) ;
ompVar    : VAR                                 ;
ompNumber : NUMBER                              ;


// LEXER RULES
OMP      : 'omp'      ;
PARALLEL : 'parallel' ;
FOR      : 'for'      ;
SECTIONS : 'sections' ;
SECTION  : 'section'  ;
SINGLE   : 'single'   ;
MASTER   : 'master'   ;
BARRIER  : 'barrier'  ;
ATOMIC   : 'atomic'   ;
CRITICAL : 'critical' ;

OMPTHREADNUM  : 'OMP_THREAD_NUM'  ;
OMPNUMTHREADS : 'OMP_NUM_THREADS' ;

PUBLIC       : 'public'       ;
PRIVATE      : 'private'      ;
FIRSTPRIVATE : 'firstprivate' ;
SCHEDULE     : 'schedule'     ;
THREAD_NUM   : 'threadNum'    ;

VAR      : JavaLetter JavaLetterOrDigit* ;
FULLNAME : JavaLetter JavaLetterOrDigit* ;
NUMBER   : Digits                        ;
WS       : [ \t\r\n\u000C]+ -> skip      ;

// following code was taken from:
// https://github.com/antlr/grammars-v4/blob/master/java8/Java8.g4
fragment
JavaLetter
    :   [a-zA-Z$_] // these are the "java letters" below 0xFF
    |   // covers all characters above 0xFF which are not a surrogate
        ~[\u0000-\u00FF\uD800-\uDBFF]
        {Character.isJavaIdentifierStart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;

fragment
JavaLetterOrDigit
    :   [a-zA-Z0-9$_] // these are the "java letters or digits" below 0xFF
    |   // covers all characters above 0xFF which are not a surrogate
        ~[\u0000-\u00FF\uD800-\uDBFF]
        {Character.isJavaIdentifierPart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;

fragment
Digits
  : Digit (DigitsAndUnderscores? Digit)?
  ;

fragment
Digit
  : '0'
  | NonZeroDigit
  ;

fragment
NonZeroDigit
  : [1-9]
  ;

fragment
DigitsAndUnderscores
  : DigitOrUnderscore+
  ;

fragment
DigitOrUnderscore
  : Digit
  | '_'
  ;
