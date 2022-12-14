import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    public static ArrayList<client> GetclientArray(){
        ArrayList<client> arr = new ArrayList<client>();
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
                arr.add(v);

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
    public static void deleteClient(client c){
        String url="jdbc:mysql://localhost:3306/location";
        String username="root";
        String password="";
        try {
            Class.forName ("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();
            String sql = "delete from client  where(numpermis=" + c.GetNumpermis()+");";
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
    public static boolean clientCheck(String nomprenom,String numpermis,String numtel){
        Pattern IntPattern = Pattern.compile("[^0-9]");
        Matcher PermisMatcher = IntPattern.matcher(numpermis);
        Matcher TelMatcher = IntPattern.matcher(numtel);
        boolean perm = PermisMatcher.find();
        boolean tel = TelMatcher.find();

        if (perm || tel || nomprenom.isEmpty() || numpermis.isEmpty() || numtel.isEmpty()) {  return true;}
        return false;
    }
}
