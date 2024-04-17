package com.kodilla.testing.forum.statistics;

import java.util.List;

class MockStatistics implements Statistics {
    private List<String> users;
    private int posts;
    private int comments;

    @Override
    public List<String> usersNames() {
        return users;
    }

    @Override
    public int postsCount() {
        return posts;
    }

    @Override
    public int commentsCount() {
        return comments;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    public void setPosts(int posts) {
        this.posts = posts;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }
}
