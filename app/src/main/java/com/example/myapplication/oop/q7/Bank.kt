package com.example.myapplication.oop.q7

class Bank {
    var customers:ArrayList<Account> = ArrayList()
    fun addCustomer(customer:Account){
        var flag:Boolean = false
        for(customer2 in this.customers){
            if (customer2.tc == customer.tc){
                flag = true // aynı tc de adam var, ekleme
                println("Hesap eklenemedı aynı tc var!")
                break
            }
        }
        if(flag == false){ // hesabı ekle
            this.customers.add(customer)
        }
    }
    fun deleteCustomer(customer:Account){
        this.customers.remove(customer)
    }
    fun addMoney(customer:Account, money:Double){
        customer.bakiye += money
        //customer.bakiye = customer.bakiye + money
    }
    fun deleteMoney(customer:Account, money:Double){
        if (customer.bakiye >= money){
        customer.bakiye -= money
        }else{
            println("Paran yetiyo git bir iş bul")
            println("Fakirler Fibabankaya gelemez")
        }
    }
    fun printCustomers(){
        for (customer in this.customers){
            customer.printCustomer()
        }
    }
}
class Account(name:String, surname:String, tc:Int, currency:String, bakiye:Double) {
    var name:String = ""
    var surname:String = ""
    var tc:Int = 0
    var currency:String = ""
    var bakiye:Double = 1.0
    init {
        this.name = name
        this.surname = surname
        this.tc = tc
        this.currency = currency
        this.bakiye = bakiye
    }
    fun printCustomer(){
        println("name = $name")
        println("surname = $surname")
        println("tc = $tc")
        println("currency = $currency")
        println("bakiye = $bakiye")
        println("*********************")
    }
}
