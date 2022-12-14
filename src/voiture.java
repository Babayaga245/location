import javax.print.DocFlavor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class voiture {
    private int matricule;
    private String modele;
    private int prix;
    private boolean state;
    public voiture(){
        matricule= Integer.parseInt(null);
        modele=null;
        prix= Integer.parseInt(null);
        state=false;
    }
    public voiture(int matricule,String modele,int prix,boolean state) {
        this.matricule=matricule;
        this.modele=modele;
        this.prix=prix;
        this.state=state;
    }



    public void SetMat(int matricule){
        this.matricule=matricule;
    }
    public int GetMat(){
        return(this.matricule);
    }
    public void SetPrix(int prix){
        this.prix=prix;
    }
    public int GetPrix(){
        return(this.prix);
    }
    public void SetMod(String modele){
        this.modele=modele;
    }
    public String GetMod(){
        return(this.modele);
    }
    public void SetState(boolean state){
        this.state=state;
    }
    public boolean GetState(){
        return(this.state);
    }
    public static ArrayList<voiture> GetCarArray(){
        ArrayList<voiture> cars=new ArrayList<>();
        String url="jdbc:mysql://localhost:3306/location";
        String username="root";
        String password="";
        try {
            Class.forName ("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from voiture");
            while (resultSet.next()){
                voiture v = new voiture(resultSet.getInt(1),resultSet.getString(2),resultSet.getInt(3),resultSet.getBoolean(4));
                cars.add(v);
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
            String sql = "insert into voiture (matricule,modele,prix,state) values('" + c.GetMat() + "','"
                    + c.GetMod() + "','" + c.GetPrix()  +"','" + c.GetState()  + "');";
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
    public static void modifyCar(voiture c){
        String url="jdbc:mysql://localhost:3306/location";
        String username="root";
        String password="";
        try {
            Class.forName ("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement= connection.createStatement();
            String sql = "update voiture set modele='"+c.GetMod()+"',prix="+c.GetPrix()+ "',state= ' "+c.GetPrix()+"  where matricule=" + c.GetMat()+";";
            statement = connection.createStatement();
            int i = statement.executeUpdate(sql);
            if (i > 0) {
                System.out.println("ROW MODIFIED");
            } else {
                System.out.println("ROW NOT MODIFIED");
            }
            connection.close();
        }
        catch (Exception e) {
            System.out.println(e);
            //test
        }
    }
}
