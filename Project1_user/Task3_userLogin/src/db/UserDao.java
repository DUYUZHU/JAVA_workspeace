package db;

import domain.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class UserDao
{
    public User getUser(String userName, String passwd)
    {
        String sql = "select * from t_user where username=? and passwd=?";
        List<User> results = JDBCUtils.query(sql,new UserRowMapper(),userName,passwd);
        if ( null != results && results.size()>0)
        {
            return results.get(0);
        }
        return null;
    }

   public  Boolean add(User user)
    {
        String sql = "insert into t_user(is,username,password) values(?,?,?)";
        JDBCUtils.update(sql,user.getId(),user.getUsername(),user.getPassword());

        return Boolean.TRUE;
    }

    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        User user = new User();
        userDao.add(user);
    }
}
