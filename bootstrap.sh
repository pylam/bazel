#!/bin/sh

#https://docs.bazel.build/versions/master/install-compile-source.html
env EXTRA_BAZEL_ARGS="--host_javabase=@local_jdk//:jdk" bash ./compile.sh
