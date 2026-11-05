cmake_minimum_required(VERSION 3.22.1)

project(whosthekiller)

add_library(
    whosthekiller
    SHARED
    native-lib.cpp
)

find_library(
    android-log
    log
)

target_link_libraries(
    whosthekiller
    ${android-log}
)
