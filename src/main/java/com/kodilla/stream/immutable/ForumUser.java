package com.kodilla.stream.immutable;

public final class ForumUser {
    private final String name;
    private final String realName;
    private final  int userID;
    private final String userName;



    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }

    public ForumUser(final String name, final String realName, final int userID, final String userName) {
        this.name = name;
        this.realName = realName;
        this.userID = userID;
        this.userName = userName;
    }
}
