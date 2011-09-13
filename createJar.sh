#!/bin/sh
TARGET=../heater.jar

cd bin && rm -rf $TARGET && zip -r $TARGET *.class && cd ..

