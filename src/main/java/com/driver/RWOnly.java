package com.driver;


//Task 2:
//create a class named RWOnly in RWOnly.java, with a private member variable name
//Task 3:
//create main function in Main.java, and crete an obj of class RWOnly in this file
//Task 4:
//        try, setting a value to name, by directly accessing it using obj and also try printing it
//Error: you might seen some error, please not it down in commnets
//Task 5:
//        try implementing getter and setters member function in class RWOnly


public class RWOnly {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
