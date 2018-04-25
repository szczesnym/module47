package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<ForumUser> forumUsers;

    public Forum() {
        this.forumUsers = new ArrayList<>();
    }

    public void fillListWithRandomUsers(int noOfUsers) {
        for (int i = 0; i < noOfUsers; i++) {
            this.forumUsers.add(ForumUser.generateRandomForumUser());
        }
    }

    public List<ForumUser> getUserList() {
        final List<ForumUser> tempForumUsers = new ArrayList(forumUsers)
        return tempForumUsers;
    }

    public void generateRandomNumberOfPostsForUsers() {
        this.getUserList().stream().forEach(u -> u.generateRandomNoOfPost(10));
    }

    public void showUsers() {
        this.getUserList().stream().forEach(System.out::println);
    }
}
