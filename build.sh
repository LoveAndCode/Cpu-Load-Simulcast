#!/bin/bash

java -version

rm -rf manifest.txt && echo "Main-Class: com.tistory.johnmark.Load" >> ./manifest.txt

rm -rf out && mkdir out

javac -d out src/com/tistory/johnmark/*.java

rm -rf cpu-simulcast.jar && jar -cvmf manifest.txt cpu-simulcast.jar -C out .