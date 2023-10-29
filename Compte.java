public class Compte{
    public Double solde; // attribut 
    public Compte(Double solde){
        this.solde = solde;
    }
    public void deposer(Double d){//gérer les versement
        this.solde += d;
    }
    public void retirer(Double r){
        this.solde -= r;
    }
    public void afficher(){
        System.out.println("Votre Solde est : "+ this.solde +" Euro");
    }
}