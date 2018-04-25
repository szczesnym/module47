package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.forumuser.SexEnum;

import java.util.Map;
import java.util.stream.Collectors;

import static java.time.temporal.ChronoField.YEAR;

public class StreamMain {
    public static void main(String[] args) {
/*       String beautyResult;
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("fhksjdhfsjkdfhk",AsterixText::asterixEveryChar );
        poemBeautifier.beautify("fhksjdhfsjkdfhk",String::toUpperCase);
        poemBeautifier.beautify("fhksjdhfsjkdfhk",(s) -> "0000000" + s);
        poemBeautifier.beautify("fhksjdhfsjkdfhk",(s) -> s + "00000000");
        poemBeautifier.beautify("fhksjdhfsjkdfhk",AsterixText::bracketEverySecondChar);*/
        Forum forum = new Forum();
        forum.fillListWithRandomUsers(20);
        forum.generateRandomNumberOfPostsForUsers();
        forum.showUsers();
        System.out.println("----------------------------------------");
        Map<Long, ForumUser> forumMapResult =
                forum.getUserList().stream().filter(user -> user.getSex() == SexEnum.M)
                        .filter(user -> (user.getBirthDate().get(YEAR) - 20) > 0)
                        .filter(user -> user.getNoOfPosts() > 0)
                        .collect(Collectors.toMap(ForumUser::getUserId, entry -> entry));
        forumMapResult.entrySet().stream()
                .forEach(System.out::println);
    }
}
