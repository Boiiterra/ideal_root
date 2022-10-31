package com.terraboii.ideal_root

import kotlin.system.exitProcess

fun new(): Int = (1..99).random()

fun main() {
    while (true) {
        var root = new()
        while (true) {
            println("Try to find square root of ${root * root}, or enter 0 to exit.")
            print("Answer -> ")
            var answer = readln().toIntOrNull()
            if (answer is Int) {
                when {
                    answer == 0 -> {
                        println("Exiting...")
                        exitProcess(0)
                    }
                    answer == root -> {
                        println("Congratulations.\n")
                        break
                    }
                }
            }

        }
    }
}