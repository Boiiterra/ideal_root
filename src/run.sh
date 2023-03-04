#!/bin/bash

kotlinc ./src/main.kt -include-runtime -d ./src/out/main.jar && java -jar ./src/out/main.jar && rm ./src/out/main.jar
