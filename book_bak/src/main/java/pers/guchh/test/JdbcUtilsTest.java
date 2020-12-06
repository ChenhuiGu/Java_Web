package pers.guchh.test;

import org.junit.Test;
import pers.guchh.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.SQLException;

public class JdbcUtilsTest {
    @Test
    public void TestJdbcUtils() throws SQLException {
        for (int i=0;i<50;i++) {
            Connection conn = JdbcUtils.getConnection();
            System.out.println(conn);
            conn.close();
        }
    }
}
