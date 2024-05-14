package com.kodilla.stream.immutable;
// TODO Stworzyć niemutowalną klasę forumUser i rekord "forumUserRekord" (wszystko w tym samym pakiecie)
public final class ForumUser {
    private final String username;
    private final String realName;

    public ForumUser(String username, String realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }
}
