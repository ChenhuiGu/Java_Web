package pers.guchh.dao.impl;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import pers.guchh.utils.JdbcUtils;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseDao {
    private final QueryRunner queryRunner = new QueryRunner();

    /**
     * 更改数据库数据数据
     * @param sql
     * @param args
     * @return 影响的行数
     */
    public int update(String sql,Object... args){
        Connection connection = JdbcUtils.getConnection();
        try {
            return queryRunner.update(connection,sql, args);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JdbcUtils.close(connection);
        }
        return -1;
    }
    public Object queryForSingleValue(String sql,Object... args){
        Connection connection = JdbcUtils.getConnection();
        try {
            return queryRunner.query(connection,sql, new ScalarHandler(),args);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JdbcUtils.close(connection);
        }
        return null;
    }
    //TODO JDBC
    public<T> T queryForOne(Class<T>type,String sql,Object... args){
        Connection connection = JdbcUtils.getConnection();
        try {
            return queryRunner.query(connection,sql, new BeanHandler<T>(type),args);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JdbcUtils.close(connection);
        }
        return null;
    }

    public<T> List<T> queryForList(Class<T>type, String sql, Object... args){
        Connection connection = JdbcUtils.getConnection();
        try {
            return queryRunner.query(connection,sql, new BeanListHandler<T>(type),args);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JdbcUtils.close(connection);
        }
        return null;
    }
}
