#!/bin/bash

cksty="checkstyle-10.20.0"

wget -qNO linter/$cksty.jar https://github.com/checkstyle/checkstyle/releases/download/$cksty/$cksty-all.jar

# find the index of the first parameter with a Java file path
idx=1
for (( i=1; i <= "$#"; i++ )); do
    if [[ ${!i} == *.java ]]; then
        idx=${i}
        break
    fi
done

files="${*:idx}"

# shellcheck disable=SC2086
java -jar linter/$cksty.jar -c linter/sun_checks.xml $files
