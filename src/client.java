import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class client {
    private int numpermis;
    private String nomprenom;
    private int tel;
    public client(){
        numpermis= Integer.parseInt(null);
        nomprenom=null;
        tel= Integer.parseInt(null);
    }
    public client(int numpermis,String nomprenom, int tel){
        this.numpermis=numpermis;
        this.nomprenom=nomprenom;
        this.tel=tel;
    }
    public void SetNumpermis(int numpermis){
        this.numpermis=numpermis;
    }
    public int GetNumpermis(){
        return(this.numpermis);
    }
    public void SetNomprenom(String nom){
        this.nomprenom=nom;
    }
    public String GetNomprenom(){
        return(this.nomprenom);
    }
    public void SetTel(int tel){
        this.tel=tel;
    }
    public int GetTel(){
        return(this.tel);
    }
    public static client[] Getclientrray(int n){
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
                client v = new client(resultSet.getInt(1),resultSet.getString(2),resultSet.getInt(3));
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
    public static void addClient(client c){
        String url="jdbc:mysql://localhost:3306/location";
        String username="root";
        String password="";
        try {
            Class.forName ("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();
            String sql = "insert into client (numpermis,nomprenom,tel) values('" + c.GetNumpermis() + "','"
                    + c.GetNomprenom() + "','" + c.GetTel()  + "');";
            System.out.println(sql);
            statement = connection.createStatement();
            int i = statement.executeUpdate(sql);
            if (i > 0) {
                System.out.println("ROW INSERTED");
            } else {
                System.out.println("ROW NOT INSERTED");
            }
            connection.close();
        }
        catch (Exception e) {
            System.out.println(e);
            //test
        }
    }
}
