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
}
