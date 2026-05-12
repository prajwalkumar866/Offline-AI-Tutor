package com.example.offlinetutor

fun main() {

    println("=================================")
    println("        OFFLINE AI TUTOR")
    println("=================================")

    while (true) {

        print("\nAsk Question: ")

        val question = readLine()?.lowercase()

        when {

            question == null -> {
                println("Goodbye!")
                return
            }

            question.contains("ohm") -> {
                println("\nOhm's Law")
                println("V = I × R")
            }

            question.contains("photosynthesis") -> {
                println("\nPhotosynthesis")
                println("Plants make food using sunlight.")
            }

            question.contains("newton") -> {
                println("\nNewton Laws")
                println("Newton laws explain motion and force.")
            }

            question.contains("acid") -> {
                println("\nAcids and Bases")
                println("Acids turn blue litmus red.")
            }

            question.contains("pythagoras") -> {
                println("\nPythagoras Theorem")
                println("a² + b² = c²")
            }

            question.contains("exit") -> {
                println("Closing Offline Tutor...")
                break
            }

            else -> {
                println("\nOffline Tutor")
                println("I will help you study CBSE topics.")
            }
        }
    }
}