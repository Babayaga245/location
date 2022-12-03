import javax.print.DocFlavor;

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
}
