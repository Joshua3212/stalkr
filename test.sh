#!/bin/bash


# run command 10 times
for i in {1..10}
do
    echo "Running command $i"
    sleep 1
    $1
done