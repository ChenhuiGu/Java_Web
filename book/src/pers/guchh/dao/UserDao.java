package pers.guchh.dao;

import pers.guchh.pojo.User;

public interface UserDao {
    /**
     * 用户名是否存在
     * @param username
     * @return
     */
    public User queryByUsername(String username);

    /**
     * 登录验证
     * @param username
     * @param password
     * @return
     */
    public User queryByUsernameAndPassword(String username,String password);

    /**
     * 用户注册
     * @param user
     * @return
     */
    public int SaveUser(User user);
}
