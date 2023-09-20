#!/bin/bash

read -p "Please enter your name: " name

hour=$(date "+%H")

if [ "$hour" -ge 0 -a "$hour" -lt 12 ]
then
    echo "Hello $name, good morning"
elif [ "$hour" -ge 12 -a "$hour" -lt 16 ]
then
        echo "Hello $name, good afternoon"
elif [ "$hour" -ge 16 -a "$hour" -lt 20 ]
then
        echo "Hello $name, good evening"
else
        echo "Hello $name, good night"
fi