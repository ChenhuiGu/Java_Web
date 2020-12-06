package pers.guchh.dao.impl;

import pers.guchh.dao.UserDao;
import pers.guchh.pojo.User;

public class UserDaoImpl extends BaseDao implements UserDao {

    @Override
    public User queryByUsername(String username) {
        String sql = "select * from t_user where username = ?";
        return queryForOne(User.class, sql, username);
    }

    @Override
    public User queryByUsernameAndPassword(String username, String password) {
        String sql = "select * from t_user where username = ? and password = ?";
        return queryForOne(User.class, sql, username,password);
    }

    @Override
    public int SaveUser(User user) {
        String sql = "insert into t_user (`username`,`password`,`email`) VALUES (?,?,?)";
        return update(sql,user.getUsername(),user.getPassword(),user.getEmail());
    }
}
