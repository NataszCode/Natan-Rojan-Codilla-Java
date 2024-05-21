package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private int uniqueUserId;
    private String username;
    private char gender; //
    private LocalDate dateOfBirth;
    private int postCount;

    // Konstruktor
    public ForumUser(int uniqueUserId, String username, char gender, LocalDate dateOfBirth, int postCount) {
        this.uniqueUserId = uniqueUserId;
        this.username = username;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.postCount = postCount;
    }

    // Gettery
    public int getUniqueUserId() {
        return uniqueUserId;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostCount() {
        return postCount;
    }

    // Settery
    public void setUniqueUserId(int uniqueUserId) {
        this.uniqueUserId = uniqueUserId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Gender must be 'M' or 'F'");
        }
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPostCount(int postCount) {
        this.postCount = postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uniqueUserId=" + uniqueUserId +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", postCount=" + postCount +
                '}';
    }
}
