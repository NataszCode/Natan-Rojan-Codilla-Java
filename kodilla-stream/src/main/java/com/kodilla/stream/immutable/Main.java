package com.kodilla.stream.immutable;



public class Main {
    public static void main(String[] args) {
        ForumUserRekord user = new ForumUserRekord("Netorak", "Natan Rojan");
        ForumUser user2 = new ForumUser("Netorak", "Natan Rojan");
        System.out.println("Username: " + user.username());
        System.out.println("Real name: " + user.realName());
    }
}


