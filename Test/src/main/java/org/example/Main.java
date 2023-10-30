package org.example;

import org.example.model.User;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        User user= new User("Peppe", "1234");

        System.out.println(user.getUsername()+" "+user.getPassword());

    }
}