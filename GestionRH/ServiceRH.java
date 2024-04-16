import java.util.ArrayList;

public class ServiceRH{
    private String nomUniv;
    private ArrayList<Personne> sesPersonnes;  
    protected ServiceRH(String nomUniv ){
        this.nomUniv = nomUniv;
        this.sesPersonnes = new ArrayList<>();
    }
    public String getNomUniv(){
        return nomUniv;
    }
    public void setNomUniv(String nomUniv){
        this.nomUniv = nomUniv;
    }
    public void ajouterPersonne(Personne p ){
        sesPersonnes.add(p);
    }
    public int nbrPersonne(){
        return sesPersonnes.size();
    }
    public void afficherLesPersonnes(){
        System.out.println("La liste des personnes gerees par ce service : ");
        for( Personne p : sesPersonnes){
            p.afficher();
            System.out.println("----");
        }
    }
    public Personne TypePersonne(String name , String lastName){
        
    }

}