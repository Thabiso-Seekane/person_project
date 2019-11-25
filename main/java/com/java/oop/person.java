package com.java.oop;

public class person {
    private int age;
    public String name;
    public String gender;
    private String [] interest;


    public person(String name, int age, String gender, String [] interest){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interest =  interest;
    }

    public String hello() {

        String output = " ";

        for (int i = 0; i < interest.length; i++) {
            if(i < interest.length-1)
                output += interest[i] +  ", ";
            else if (i == interest.length-1){
                output += "and " + interest[i];
            }
            // removes comma after second last element
            else if (i == interest.length-2){
                output += interest[i] +  " ";
            }
        }
        return  "Hello, my name is " + name + " and i am " + age + " years old. My interest are" + output;

    }

}
