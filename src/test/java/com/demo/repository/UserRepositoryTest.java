package com.demo.repository;

import com.demo.domain.User;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository1;

    @Test
    public void name() {
        assertEquals("hello", "hello");
    }

//    /@Ignore
    @Test
    public void save() {
        User user = new User("111", "111", "111");


        userRepository1.save(user);
    }
}