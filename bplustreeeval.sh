#!/usr/bin/bash

nblocks="1000"
bsizes="8192"

rm -f externalsorteval.log

mvn clean compile 1> /dev/null

# DO NOT CHANGE MAVEN_OPTS
MAVEN_OPTS=-Xmx16m mvn exec:java -Dexec.mainClass="edu.hanyang.test.BPlusTreeEval" -Dexec.args="$nblocks $nblocks" 2>> bplustreeeval.log
