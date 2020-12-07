package pers.guchh.service.impl;

import pers.guchh.dao.UserDao;
import pers.guchh.dao.impl.UserDaoImpl;
import pers.guchh.pojo.User;
import pers.guchh.service.UserService;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl();
    @Override
    public void registerUser(User user) {
        userDao.SaveUser(user);
    }

    @Override
    public User login(User user) {
        return userDao.queryByUsernameAndPassword(user.getUsername(),user.getPassword());
    }

    @Override
    public boolean existUsername(String username) {
        return userDao.queryByUsername(username) != null;

    }
}
