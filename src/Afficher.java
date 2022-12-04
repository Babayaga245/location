import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Afficher {
    public static voiture[] cars(int n){
        voiture cars[]=new voiture[200];
        String url="jdbc:mysql://localhost:3306/location";
        String username="root";
        String password="";
        try {
            Class.forName ("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from voiture");
            while (resultSet.next()){
                voiture v = new voiture(resultSet.getString(1),resultSet.getString(2),resultSet.getFloat(3));
                cars[n]=v;
                n++;
            }

            connection.close();
        }
        catch (Exception e) {
            System.out.println(e);
            //test
        }

        return(cars);

    }
    public static client[] clients(int n){
        client arr[]=new client[200];
        String url="jdbc:mysql://localhost:3306/location";
        String username="root";
        String password="";
        try {
            Class.forName ("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from client");
            while (resultSet.next()){
                client v = new client(resultSet.getInt(6),resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getInt(4));
                arr[n]=v;
                n++;
            }

            connection.close();
        }
        catch (Exception e) {
            System.out.println(e);
            //test
        }

        return(arr);

    }
}
