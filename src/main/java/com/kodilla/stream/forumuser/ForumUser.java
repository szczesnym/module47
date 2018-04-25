package com.kodilla.stream.forumuser;


import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

import com.kodilla.stream.SupportRandom;

public class ForumUser {
    private String name;
    private String surname;
    private long userId;
    private String userName;
    private SexEnum sex;
    private LocalDate birthDate;
    private int noOfPosts;

    public ForumUser(String name, String surname, int userId, SexEnum sex, LocalDate birthDate) {
        Random generator = new Random();
        this.name = name;
        this.surname = surname;
        this.userId = System.currentTimeMillis() + generator.nextInt(10000);
        this.sex = sex;
        this.birthDate = birthDate;
        this.userName = surname + "-" + name;
    }

    public static ForumUser generateRandomForumUser() {
        Random generator = new Random();
        SexEnum randomSex;

        if (generator.nextInt(2) == 0) {
            randomSex = SexEnum.M;
        } else {
            randomSex = SexEnum.F;
        }
        return new ForumUser(SupportRandom.randomName(),
                SupportRandom.randomSurname(),
                generator.nextInt(2000),
                randomSex,
                LocalDate.of(generator.nextInt(50) + 1960, generator.nextInt(12) + 1, generator.nextInt(28) + 1)
        );
    }

    public void generateRandomNoOfPost(int maxNumberOfPost) {
        Random generator = new Random();
        this.setNoOfPosts(generator.nextInt(maxNumberOfPost));
    }

    /*    public int userYearOfBirth() {
            return this.birthDate.wi
        }*/
    @Override
    public String toString() {
        return "ForumUser{" +
                "name='" + name + '\'' +
                ", Surname='" + surname + '\'' +
                ", User ID=" + userId +
                ", User Name='" + userName + '\'' +
                ", Sex=" + sex +
                ", Birth Date=" + birthDate +
                ", No Of Posts=" + noOfPosts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return getUserId() == forumUser.getUserId() &&
                getNoOfPosts() == forumUser.getNoOfPosts() &&
                Objects.equals(getName(), forumUser.getName()) &&
                Objects.equals(surname, forumUser.surname) &&
                Objects.equals(getUserName(), forumUser.getUserName()) &&
                getSex() == forumUser.getSex() &&
                Objects.equals(getBirthDate(), forumUser.getBirthDate());
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public SexEnum getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNoOfPosts() {
        return noOfPosts;
    }

    public void setNoOfPosts(int noOfPosts) {
        this.noOfPosts = noOfPosts;
    }
}
