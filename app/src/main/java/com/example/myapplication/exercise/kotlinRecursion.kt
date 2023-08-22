package com.example.myapplication.exercise

fun sumDigits(n: Int): Int {
  // Base case: If the number is single-digit, return the number itself
  if (n < 10 && n >= 0) {
    return n
  }

  // Recursive case: Get the last digit and add it to the sum of the remaining digits
  val lastDigit = n % 10
  val remainingDigits = n / 10

  return lastDigit + sumDigits(remainingDigits)
}
fun main(){
  var x = sumDigits(n = 523)
  println(x)
}