package com.example.myapplication.oop.q5

class Book(title:String, author:String, ISBN:Int) {
    var title:String = ""
    var author:String = ""
    var ISBN:Int = 0
    init {
        this.title = title
        this.author = author
        this.ISBN = ISBN
    }
}
class Library(){
    var books:ArrayList<Book> = ArrayList()
    fun addBooks(B:Book){
        books.add(B)
    }
    fun deleteBooks(B: Book){
        books.remove(B)
    }
    fun printBook(){
        for (book in books){
            println(book.title)
            println(book.author)
            println(book.ISBN)
            println("***********")
        }
    }
}