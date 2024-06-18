package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> users;

    // Konstruktor
    public Forum() {
        this.users = new ArrayList<>();
    }

    // Dodanie użytkownika
    public void addUser(ForumUser user) {
        this.users.add(user);
    }

    // Usuwanie użytkownika po numerze
    public boolean removeUserById(int userId) {
        return users.removeIf(user -> user.getUniqueUserId() == userId);
    }

    // Pobranie użytkownika po numerze
    public ForumUser getUserById(int userId) {
        for (ForumUser user : users) {
            if (user.getUniqueUserId() == userId) {
                return user;
            }
        }
        return null; // zwrot null gdy poda się błędny identyfikator
    }

    // Lista wszystkich użytkowników
    public List<ForumUser> getUsers() {
        return new ArrayList<>(users); // zwraca kopię listy użytkowników
    }

    // Zwrot listy wszystkich użytkowników
    public List<ForumUser> getUserList() {
        return users;
    }

    // Wyświetlenie wszystkich użytkowników
    public void printAllUsers() {
        for (ForumUser user : users) {
            System.out.println(user);
        }
    }
}
