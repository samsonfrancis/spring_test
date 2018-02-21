#!/bin/sh
shape=circle
CLASSPATH= 
for file in target/lib/*.jar; do
    CLASSPATH=${CLASSPATH}:$file;
done
CLASSPATH=${CLASSPATH}:target/spring_test-1.0-SNAPSHOT.jar 
eval java -cp ${CLASSPATH} com.sam.DrawingApp ${shape}
