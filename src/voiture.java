import javax.print.DocFlavor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class voiture {
    private String matricule;
    private String modele;
    private float prix;
    public voiture(){
        matricule=null;
        modele=null;
        prix=0;
    }
    public voiture(String matricule,String modele,float prix) {
        this.matricule=matricule;
        this.modele=modele;
        this.prix=prix;
    }
    public void SetMat(String matricule){
        this.matricule=matricule;
    }
    public String GetMat(){
        return(this.matricule);
    }
    public void SetPrix(int prix){
        this.prix=prix;
    }
    public float GetPrix(){
        return(this.prix);
    }
    public void SetMod(String modele){
        this.modele=modele;
    }
    public String GetMod(){
        return(this.modele);
    }
    public static voiture[] GetCarArray(int n){
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
    public static void addCar(voiture c){
        String url="jdbc:mysql://localhost:3306/location";
        String username="root";
        String password="";
        try {
            Class.forName ("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();
            String sql = "insert into voiture (matricule,modele,prix) values('" + c.GetMat() + "','"
                    + c.GetMod() + "','" + c.GetPrix()  + "');";
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
    public static void deleteCar(voiture c){
        String url="jdbc:mysql://localhost:3306/location";
        String username="root";
        String password="";
        try {
            Class.forName ("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();
            String sql = "delete from voiture  where(matricule=" + c.GetMat()+");";
            statement = connection.createStatement();
            int i = statement.executeUpdate(sql);
            if (i > 0) {
                System.out.println("ROW DELETED");
            } else {
                System.out.println("ROW NOT DELETED");
            }
            connection.close();
        }
        catch (Exception e) {
            System.out.println(e);
            //test
        }
    }
}
