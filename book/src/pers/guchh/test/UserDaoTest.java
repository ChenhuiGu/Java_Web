package pers.guchh.test;

import org.junit.Test;
import pers.guchh.dao.UserDao;
import pers.guchh.dao.impl.UserDaoImpl;
import pers.guchh.pojo.User;

import static org.junit.Assert.*;

public class UserDaoTest {
    UserDao userDao = new UserDaoImpl();
    @Test
    public void queryByUsername() {
        User admin = userDao.queryByUsername("admin");
        System.out.println(admin);
    }

    @Test
    public void queryByUsernameAndPassword() {
        User user = userDao.queryByUsernameAndPassword("admin", "admin1");
        System.out.println(user);
    }

    @Test
    public void saveUser() {
        int guchh = userDao.SaveUser(new User(null, "guchh", "199211", "gchhit@163.com"));
        if (guchh == 1){
            System.out.println("用户注册成功");
        }else{
            System.out.println("用户注册失败");
        }
    }
}