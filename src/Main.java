import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //ArrayList<client> arr = client.GetclientArray();
        //System.out.println(arr.size());
        //for(int i=0;i<arr.size();i++)
        //{
            //System.out.println("test"+i);
            //System.out.println("num permis ="+arr.get(i).GetNumpermis()+" nom ="+arr.get(i).GetNomprenom()+" tel="+arr.get(i).GetTel());
        //}

        //String url="jdbc:mysql://localhost:3306/location";
        //String username="root";
        //String password="";

        //test ajout
        //client c = new client(11111111,"testtest",11111111);
        //client.deleteClient(c);

        //ll coleur louwel mta3 dashboard wl color lekher mta3 ll panel lokhra
        UI.Start(Color.red,Color.white);
        voiture v = new voiture(1458967,"bmw",150,false);
        //voiture.deleteCar(v);
        //try {
            //Class.forName ("com.mysql.cj.jdbc.Driver");

            //Connection connection = DriverManager.getConnection(url,username,password);
        /*Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from client");
            while (resultSet.next()){
                System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(6));
            }*/
            //connection.close();
        }
        //catch (Exception e) {
            //System.out.println(e);
            //test
        //}



    }
