public class Car{
    private String marque; 
    private Double prix;
    public Car(){
    }
    public String getMarque(){
        return this.marque;
    }
    public void setMarque(String marque){
        this.marque = marque; 
    }
    public Double getPrix(){
        return  this.prix;
    }
    public void setPrix(Double prix){
        this.prix = prix;
    }
    public void afficher(){
        System.out.println(" MARQUE: " +this.marque);
        System.out.println("Prix : "+ this.prix +" Euro");
    }

}