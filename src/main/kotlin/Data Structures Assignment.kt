import kotlin.math.round


class Assign1_Superheroes {

    val ANSI_RESET = "\u001B[0m"
    val ANSI_BLACK = "\u001B[30m"
    val ANSI_RED = "\u001B[31m"
    val ANSI_GREEN = "\u001B[32m"
    val ANSI_YELLOW = "\u001B[33m"
    val ANSI_BLUE = "\u001B[34m"
    val ANSI_PURPLE = "\u001B[35m"
    val ANSI_CYAN = "\u001B[36m"
    val ANSI_WHITE = "\u001B[37m"

    fun main() {

        coffeeCounter()

    }

    private fun superheros() { // Method calling Assignment 1
        val names: java.util.ArrayList<String> = ArrayList<String>(5)
        names.add("Python")
        names.add("HTML")
        names.add("Java")
        names.add("Kotlin")
        names.add("Assembly")

        for (name in names) {

            println(name)

        }

        names[0] = "PYPY"
        names[4] = "ASS"

        println(names)

        val creator: ArrayList<String> = ArrayList<String>(5)
        creator.add("Guido van Rossum")
        creator.add("Tim Berners-Lee")
        creator.add("James Gosling")
        creator.add("Jetbrains")
        creator.add("David Wheeler")

        val isJVM: ArrayList<Boolean> = ArrayList<Boolean>(5)
        isJVM.add(false)
        isJVM.add(false)
        isJVM.add(true)
        isJVM.add(true)
        isJVM.add(false)

        println("  Name\t\t\t\tCreator\t\t\t\tUses JVM?")
        // if(!isJVM[i]) continue

        for (i in 0 until names.size) println(
            "$i ${names[i]} ${
                " ".repeat(16 - names[i].length)
            } ${creator[i]} ${
                " ".repeat(18 - creator[i].length)
            } ${if (isJVM[i]) ANSI_GREEN else ANSI_RED}${isJVM[i]}$ANSI_RESET"
        )
    }

    private fun storingMarks() { // Method calling Assignment 2

        val names: ArrayList<String> = arrayListOf("Liam", "Olivia", "Noah", "Emma", "Oliver", "Ava")
        val gradeNum: ArrayList<Int> = arrayListOf(10, 10, 11, 11, 12, 12)
        val exam1: ArrayList<Double> = arrayListOf(62.0, 74.0, 94.4, 66.2, 55.5, 58.4)
        val exam2: ArrayList<Double> = arrayListOf(84.6, 82.7, 90.8, 78.2, 52.3, 63.8)
        val exam3: ArrayList<Double> = arrayListOf(86.3, 56.6, 65.1, 94.7, 70.0, 63.2)

        for (i in 0 until names.size) {

            println("${names[i]} ${gradeNum[i]} ${exam1[i]}, ${exam2[i]}, ${exam3[i]}")

        }
        for (i in 0 until names.size) {

            exam3.set(i, exam3[i] + 5.0)

        }

        println("/*********************Updated Exam3 Marks***********/")
        for (i in 0 until names.size) {

            println("${names[i]} ${gradeNum[i]} ${exam1[i]}, ${exam2[i]}, ${exam3[i]}")

        }

        println("/*********************Filtered Print - Grade 10s and 11s***********/")
        for (i in 0 until names.size) {

            if (gradeNum[i] == 10 || gradeNum[i] == 11)
                println("${names[i]} ${gradeNum[i]} ${exam1[i]}, ${exam2[i]}, ${exam3[i]}")

        }

        println("/*********************Filtered Print - Exam 1 failures***********/")
        for (i in 0 until names.size) {

            if (exam1[i] >= 66.6) continue
            println("${names[i]} ${gradeNum[i]} ${exam1[i]}")

        }

        println("/*********************Class Averages - Final 20%***********/")

        println("Average for Exam #1: ${exam1.average()}")

        println("Average for Exam #2: ${exam2.average()}")

        println("Average for Exam #3: ${exam3.average()}")

        println("/*********************Extra Challenges***********/")
        for (i in 0 until names.size) {

            println("Total Average for ${names[i]}: ${((exam1[i] + exam2[i] + exam3[i]) / 3).round()}")

        }

    }

    private fun bikeAThon() { // Method calling Assignment 3

        val names: ArrayList<String> =
            arrayListOf("Alex", "Harper", "Henry", "Evelyn", "Lucas", "Mia", "Benjamin", "Isabella", "James", "Amelia")
        val amounts: ArrayList<Double> =
            arrayListOf(148.15, 231.47, 42.62, 192.88, 452.52, 551.97, 482.46, 728.22, 152.92, 232.86)
        val returnedForm: ArrayList<Boolean> =
            arrayListOf(false, false, false, true, false, true, false, true, false, false)

        println("  Names\t\t\t\tAmount (${'$'})\t\t\t\tPermission Forms")
        for (i in 0 until names.size) {

            println(
                "$i ${names[i]} ${
                    " ".repeat(16 - names[i].length)
                } ${amounts[i]} ${
                    " ".repeat(22 - amounts[i].toString().length)
                } ${if (returnedForm[i]) ANSI_GREEN else ANSI_RED}${returnedForm[i]}$ANSI_RESET"
            )

        }

        println("Total amount raised by team: ${'$'}${amounts.total()}")
        println("Total average of the amount raised by team: ${'$'}${amounts.average()}")

        var lessThan120 = 0
        for (i in amounts) {

            if (i < 120.0) lessThan120++

        }
        println("No. of students who raised less than $120: $lessThan120")
        if (lessThan120 > 2) println("Living Room Location: Closet")

        print("Students who did not turn in the form yet: ")
        for (i in 0 until names.size) {

            if (returnedForm[i]) continue
            if (i == (names.size - 1)) print(names[i])
            else print("${names[i]}, ")

        }
        print("\n")

        var tempHighest = 0.0
        var richIndex = -1
        for (i in 0 until amounts.size) {

            if (amounts[i] > tempHighest) {

                tempHighest = amounts[i]
                richIndex = i

            }

        }
        println("${names[richIndex]} raised the highest amount, ${'$'}${amounts[richIndex]}!")

        var tempRichTotal = 0.0
        for (i in amounts) {

            if (i > 500) {

                tempRichTotal += i

            }

        }
        println("Some big donors (who raised more than ${'$'}500) donated total of ${'$'}${tempRichTotal.round()}!")

    }

    private fun coffeeCounter() { // Method calling Assignment 4

        /* https://globalassets.starbucks.com/assets/94fbcc2ab1e24359850fa1870fc988bc.pdf */
        /* All data is based on size "Grande" */

        val drinkName: ArrayList<String> = arrayListOf(
            "Iced Coffee",
            "Iced Caffe Americano",
            "Caffe Latte",
            "Caramel Macchiato",
            "Strawberry Smoothie",
            "Hot Chocolate"
        ) // Product Name
        val calories: ArrayList<Int> = arrayListOf(80, 15, 130, 200, 290, 270) // Calories
        val fatContent: ArrayList<Double> = arrayListOf(0.1, 0.0, 0.3, 1.5, 1.0, 2.5) // Total Fat (g)
        val caffeine: ArrayList<Int> = arrayListOf(165, 225, 150, 150, 0, 25) // Caffeine (mg)
        var totalCalories: Int = 0
        var totalFat: Double = 0.0
        var totalCaffeine: Int = 0
        var totalDrinks: Double = 0.0

        println("Drinks Available: ")
        for (i in drinkName) println("\t* ${i}")

        var order: String = ""
        while (order != "exit") {

            println("=".repeat(80))
            println("What coffee did you drink today?")
            order = readLine().toString()
            if (order.equals("exit", true)) break

            val indexOfOrder: Int = drinkName.searchString(order)
            if (indexOfOrder != -1) {

                totalDrinks++
                totalCalories += calories[indexOfOrder]
                totalFat += fatContent[indexOfOrder]
                totalCaffeine += caffeine[indexOfOrder]
                println(
                    "You consumed: ${calories[indexOfOrder]} calories, " +
                            "${fatContent[indexOfOrder]} grams of fat and ${caffeine[indexOfOrder]} mg of caffeine."
                )

            }
            else println("That drink is not in the above list. Please try again.")

        }
        println(
            "You consumed $totalCalories calories, " +
                    "$totalFat grams of fat and $totalCaffeine mg of caffeine today. What a great day!"
        )
        println(
            "FYI: You consumed ${(totalCalories / totalDrinks).round()} calories, " +
                    "${(totalFat / totalDrinks).round()} grams of fat and ${(totalCaffeine / totalDrinks).round()} mg of caffeine per drink."
        )

    }

    fun ArrayList<Double>.total(round: Int? = null): Double {

        var total = 0.0

        for (i in this) {

            total += i

        }

        return if (round == null) total
        else total.round(round)

    }

    fun ArrayList<Double>.average(round: Int = 2): Double {

        var tempTotal = 0.0

        for (i in this) {

            tempTotal += i

        }

        return (tempTotal / this.size).round(round)

    }

    /* https://discuss.kotlinlang.org/t/how-do-you-round-a-number-to-n-decimal-places/8843 */
    fun Double.round(decimals: Int = 2): Double {
        var multiplier = 1.0
        repeat(decimals) { multiplier *= 10 }
        return round(this * multiplier) / multiplier
    }

    /* Mr. Artym code (Edited) */
    fun ArrayList<String>.searchString(searchTerm: String): Int {

        for (i in this.indices) {

            //returns index of found item
            if (this[i].equals(searchTerm, true)) return i

        }

        return -1 //returns -1 if not found

    }


}