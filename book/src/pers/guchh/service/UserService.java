package pers.guchh.service;
import pers.guchh.pojo.User;

/**
 * 用户注册与登录的逻辑
 */
public interface UserService {
    /**
     * 用户注册,保存用户信息
     * @param user
     */
    public void registerUser(User user);

    /**
     * 用户登录
     * @param user
     * @return
     */
    public User login(User user);

    /**
     * 验证用户是否存在
     * @param username
     * @return 存在true
     */
    public boolean existUsername(String username);
}
