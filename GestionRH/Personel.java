abstract class Personnel extends Personne{
    protected Contract contract; 
    protected Personnel(String name, String lastname, int age, Contract contract){
        super(name, lastname, age); 
        this.contract = contract; 
    }
    protected Contract getContract(){
        return contract; 
    }
    protected void setContract(Contract contract){
        this.contract = contract; 
    }
    abstract void Afficher(); 
}   