package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        // Tworzenie obiektów ForumUser
        ForumUser user1 = new ForumUser(1, "jan_kowal", 'M', LocalDate.now().minusYears(20).plusDays(1), 10);
        ForumUser user2 = new ForumUser(2, "kasia_kat", 'F', LocalDate.of(2000, 8, 15), 0);
        ForumUser user3 = new ForumUser(3, "michal_dzwon", 'M', LocalDate.now().minusYears(20), 5);
        ForumUser user4 = new ForumUser(4, "ola_pozew", 'F', LocalDate.of(1998, 1, 25), 20);
        ForumUser user5 = new ForumUser(5, "kacper_konewka", 'M', LocalDate.of(2004, 4, 30), 3);

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
