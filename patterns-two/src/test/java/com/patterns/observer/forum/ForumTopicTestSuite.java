package com.patterns.observer.forum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ForumTopicTestSuite {

    @Test
    void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser john = new ForumUser("John");
        ForumUser sam = new ForumUser("Sam");
        ForumUser mike = new ForumUser("Mike");
        javaHelpForum.registerObserver(john);
        javaToolsForum.registerObserver(sam);
        javaHelpForum.registerObserver(mike);
        javaToolsForum.registerObserver(mike);

        //When
        javaHelpForum.addPost("Hi everyone! Could you help me with for loop?");
        javaHelpForum.addPost("Better try to use while loop in this case.");
        javaToolsForum.addPost("Help pls, my MySQL db doesn't want to work :(");
        javaHelpForum.addPost("Why while? Is it better?");
        javaToolsForum.addPost("When I try to log in I got 'bad credentials' message");

        //Then
        assertEquals(3, john.getUpdateCount());
        assertEquals(2, sam.getUpdateCount());
        assertEquals(5, mike.getUpdateCount());

    }
}
