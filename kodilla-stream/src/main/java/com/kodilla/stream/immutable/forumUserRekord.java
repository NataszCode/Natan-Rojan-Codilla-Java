package com.kodilla.stream.immutable;

public record ForumUserRecord(String username, String realName) {}

public class Main {
    public static void main(String[] args) {
        ForumUserRecord user = new ForumUserRecord("Netorak", "Natan Rojan");
        System.out.println("Username: " + user.username());
        System.out.println("Real name: " + user.realName());
    }
}


