package com.example.myapplication.exercise.classExercise

sealed class Result {
    data class Success(val data: String): Result()
    data class Error(val errorMessage: String): Result()
}
fun processResult(result: Result){
    when (result){
        is Result.Success -> {
            println("Operation succeeded. Data: ${result.data}")
        }
        is Result.Error -> {
            println("Operation failed. Error message: ${result.errorMessage}")
        }
    }
}
fun main(){
    val successResult = Result.Success("Data loaded successfully")
    val errorResult = Result.Error("Failed to load data")

    processResult(successResult)
    processResult(errorResult)
}
