omp4j grammar
=======
This repository consists of `Java8` and `OMP` grammars.

Grammars in `.g4` format are located in `src/` directory. One can compile them into `.java` source code using ANTLR4:
- *NIX systems: simply run `./update.sh`
- other systems: please read [this site](https://theantlrguy.atlassian.net/wiki/display/ANTLR4/Getting+Started+with+ANTLR+v4). Basically one must download `antlr-4.4-complete.jar` and consequently run commands from `./update.sh` in order to generate files properly.

License
-------
`src/Java8.g4` is taken fron [antlr/grammars-v4/java8/Java8.g4](https://github.com/antlr/grammars-v4/blob/3c817f97e8618c9006a9dfdb4d9d9d5cce2c7990/java8/Java8.g4). The authors of `omp4j` project **are not** authors of this file. Please read the BSD licence in the beginning of the file itself.

Other repository files are also under BSD license. Please see `LICENSE` file.
