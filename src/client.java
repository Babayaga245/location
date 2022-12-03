public class client {
    private int numpermis;
    private String nom;
    private String prenom;
    private String adresse;
    private int tel;
    public client(){
        numpermis= Integer.parseInt(null);
        nom=null;
        prenom=null;
        adresse=null;
        tel= Integer.parseInt(null);
    }
    public client(int numpermis,String nom,String prenom, String adresse, int tel){
        this.numpermis=numpermis;
        this.nom=nom;
        this.prenom=prenom;
        this.adresse=adresse;
        this.tel=tel;
    }
    public void SetNumpermis(int numpermis){
        this.numpermis=numpermis;
    }
    public int GetNumpermis(){
        return(this.numpermis);
    }
    public void SetNom(String nom){
        this.nom=nom;
    }
    public String GetNom(){
        return(this.nom);
    }
    public void SetPrenom(String prenom){
        this.prenom=prenom;
    }
    public String GetPrenom(){
        return(this.prenom);
    }
    public void SetAdresse(String adresse){
        this.adresse=adresse;
    }
    public String GetAdresse(){
        return(this.adresse);
    }
    public void SetTel(int tel){
        this.tel=tel;
    }
    public int GetTel(){
        return(this.tel);
    }

}
