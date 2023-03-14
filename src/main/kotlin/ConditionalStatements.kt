fun main(args: Array<String>) {
    // IF STATEMENTS
    var age = 20
    if (age<18){
        println("You are underage")
    }else{
        println("Welcome to the party")
    }

    var weight = 100
    var height = 1.9
    var bmi = weight / (height * height)
    if (bmi <= 18){
        println("Underweight")
    }else if (bmi <= 29){
        println("Normal weight")
    }else if (bmi <= 34){
        println("Overweight")
    }else{
        println("Obese")
    }

    var score = 600
    var no_of_subjects = 8
    var mean_score = score / no_of_subjects
    if (mean_score >= 80){
        println("Your mean grade is A")
    }else if (mean_score >= 70){
        println("Your mean grade is B")
    }else if (mean_score >= 60){
        println("Your mean grade is C")
    }else if (mean_score >= 50){
        println("Your mean grade is D")
    }else{
        println("Your mean grade is E")
    }

    // WHEN STATEMENTS
    var bettingNumber = 0
    when(bettingNumber){
        1 ->{
            println("You lost")
        }
        2 ->{
            println("You lost")
        }
        3 ->{
            println("You won")
        }
        4 ->{
            println("You lost")
        }
        else ->{
            println("Enter a number from 1 - 4 to bet")
        }
    }
}