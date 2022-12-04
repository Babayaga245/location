import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class AfficherVoitures {
    public static voiture[] Afficher(int n){
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
}
