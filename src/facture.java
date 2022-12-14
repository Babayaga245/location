import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class facture {
    private int numpermis;
    private int matricule;
    private String date_deb;
    private int num_days;
    public facture(){
        this.numpermis=0;
        this.matricule=0;
        this.date_deb=null;
        this.num_days=0;

    }
    public facture(int numpermis,int matricule,String date_deb,int num_days){
        this.numpermis=numpermis;
        this.matricule=matricule;
        this.date_deb=date_deb;
        this.num_days=num_days;
    }
    public int GetNumpermis(){
        return(this.numpermis);
    }
    public int GetMatricule(){
        return(this.matricule);
    }
    public String GetDatedeb(){
        return(this.date_deb);
    }
    public int GetNumdays(){
        return(this.num_days);
    }

    public static facture[] GetfacArray(int n){
        facture cars[]=new facture[200];
        String url="jdbc:mysql://localhost:3306/location";
        String username="root";
        String password="";
        try {
            Class.forName ("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from facture");
            while (resultSet.next()){
                facture v = new facture(resultSet.getInt(1),resultSet.getInt(2),resultSet.getString(3),resultSet.getInt(4));
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
    public static void addFac(facture c){
        String url="jdbc:mysql://localhost:3306/location";
        String username="root";
        String password="";
        try {
            Class.forName ("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();
            String sql = "insert into facture  values('" + c.GetNumpermis() + "','"
                    + c.GetMatricule() + "','" + c.GetDatedeb()  + "','" + c.GetNumdays()  + "');";
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
    public static void deletefacs(){
        String url="jdbc:mysql://localhost:3306/location";
        String username="root";
        String password="";
        try {
            Class.forName ("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();
            String sql = "delete from facture; ";
            statement = connection.createStatement();
            int i = statement.executeUpdate(sql);
            if (i > 0) {
                System.out.println("ALL ROWs DELETED");
            } else {
                System.out.println(" NOT DELETED");
            }
            connection.close();
        }
        catch (Exception e) {
            System.out.println(e);
            //test
        }
    }
}
