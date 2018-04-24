package com.kodilla.stream.immutable;

public final class ForumUser {
    private final String name;
    private final String realName;

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }

    public ForumUser(final String name, final String realName) {
        this.name = name;
        this.realName = realName;
    }
}
