package com.java.oop;

public class main {
    public static void main(String[] args) {
        person objperson = new person("Thabios",25,"Male", new String[] {"Playing games to blow off steam", "Coding", "Inkomasi", "Bikes","Healthy drinks"});
        String Halla = objperson.hello();
        System.out.println(Halla);
    }

}
