package db;

import com.alibaba.druid.pool.DruidDataSource;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DruidConnectionUtils
{
    static Properties properties = new Properties();

    private static DruidDataSource dataSource;

    static InputStream input;

    static
    {
        try
        {
            //input = new FileInputStream("application.properties");

            input = DruidConnectionUtils.class.getClassLoader().getResourceAsStream("application.properties");

//          input = DatabaseConnectionUtils.class
            properties.load(input);

            String url = properties.getProperty("jdbc.url");
            String driver = properties.getProperty("jdbc.driverClassName");
            String username = properties.getProperty("jdbc.username");
            String password = properties.getProperty("jdbc.password");


            dataSource = new DruidDataSource();
            dataSource.setUrl(url);
            dataSource.setUsername(username);
            dataSource.setPassword(password);
            dataSource.setDriverClassName(driver);

            //TODO: other properties;

        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() throws SQLException{
        return dataSource.getConnection();
    }

    public static void close(Connection conn, Statement stmt, ResultSet rs)
    {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws  Exception{
        Connection connect= DruidConnectionUtils.getConnection();
        System.out.println("connect:" + connect);



    }
}

///The server time zone value '�й���׼ʱ��' is unrecognized or represents more than one time zone
//减低banbe
