#!/usr/bin/bash

nblocks="100 200 500"
bsizes="8192 16384"

#rm -f externalsorteval.log

for n in $nblocks; do
  for s in $bsizes; do
    MAVEN_OPTS=-Xmx16m mvn exec:java -Dexec.mainClass="edu.hanyang.test.ExternalSortEval" -Dexec.args="$s $n -Xmx8m" 2>> externalsorteval.log 1>/dev/null
  done
done
