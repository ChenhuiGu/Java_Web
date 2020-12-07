package pers.guchh.test;

import org.junit.Test;
import pers.guchh.service.UserService;
import pers.guchh.service.impl.UserServiceImpl;

import static org.junit.Assert.*;

public class UserServiceImplTest {
    UserService userService = new UserServiceImpl();
    @Test
    public void registerUser() {
    }

    @Test
    public void login() {
    }

    @Test
    public void existUsername() {
        boolean guchh = userService.existUsername("guchh");
        System.out.println(guchh);
    }
}