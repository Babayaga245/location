import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/location";
        String username="root";
        String password="";
        UI.Start();
        try {
            Class.forName ("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url,username,password);
        /*Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from client");
            while (resultSet.next()){
                System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(6));
            }*/
            connection.close();
        }
        catch (Exception e) {
            System.out.println(e);
            //test
        }

    }
}