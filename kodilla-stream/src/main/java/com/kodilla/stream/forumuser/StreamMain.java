package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        // Tworzenie obiektów ForumUser
        ForumUser user1 = new ForumUser(1, "jan_kowal", 'M', LocalDate.of(1996, 5, 20), 10);
        ForumUser user2 = new ForumUser(2, "kasia_kat", 'F', LocalDate.of(2000, 8, 15), 5);
        ForumUser user3 = new ForumUser(3, "michal_dzwon", 'M', LocalDate.of(1982, 3, 10), 0);
        ForumUser user4 = new ForumUser(4, "ola_pozew", 'F', LocalDate.of(1998, 1, 25), 20);
        ForumUser user5 = new ForumUser(5, "kacper_konewka", 'M', LocalDate.of(2008, 6, 30), 3);

        // Obiekty i dodawanie
        Forum forum = new Forum();
        forum.addUser(user1);
        forum.addUser(user2);
        forum.addUser(user3);
        forum.addUser(user4);
        forum.addUser(user5);

        // Inicjalizacja strumienia
        List<ForumUser> userList = forum.getUserList();
        Map<Integer, ForumUser> resultMap = userList.stream()
                .filter(user -> user.getGender() == 'M') // Only man
                .filter(user -> Period.between(user.getDateOfBirth(), LocalDate.now()).getYears() >= 20) // Minimum 20 lat
                .filter(user -> user.getPostCount() > 0) // Co najmniej jeden post
                .collect(Collectors.toMap(ForumUser::getUniqueUserId, user -> user)); // Mapa

        // Wyświetlanie wyniku
        resultMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
