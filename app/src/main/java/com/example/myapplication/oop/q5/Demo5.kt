package com.example.myapplication.oop.q5

fun main(){
    var book = Book(title = "Harry", author = "Erdem", ISBN = 1)
    var book2 = Book(title = "Dan", author = "Erdem", ISBN = 2)
    var book3 = Book(title = "Petter", author = "Erdem", ISBN = 3)
    var myLibrary = Library()
    myLibrary.addBooks(book)
    myLibrary.addBooks(book2)
    myLibrary.addBooks(book3)
    myLibrary.printBook()
    myLibrary.deleteBooks(book2)
    println("***********")
    println("***********")
    println("***********")
    println("***********")
    myLibrary.printBook()
}