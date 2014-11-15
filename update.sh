#!/bin/sh

antlrName="antlr-4.4-complete.jar"
packageName="org.omp4j.grammar"
srcDir="src"
optDir="opt"

# download ANTLR grammar-compiler dependency
if [ ! -f "$antlrName" ]; then
	printf "[Downloading ANTLR4]\n" 1>&2
	curl -O http://www.antlr.org/download/antlr-4.4-complete.jar
fi

# compile grammars
printf "[Compiling OMP]\n" 1>&2
java -jar "$antlrName" -listener -visitor -package "$packageName" -o $optDir $srcDir"/OMP.g4"

printf "[Compiling Java8]\n" 1>&2
java -jar "$antlrName" -listener -visitor -package "$packageName" -o $optDir $srcDir"/Java8.g4"
