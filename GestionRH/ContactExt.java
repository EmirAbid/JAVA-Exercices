public class ContactExt extends Personne{
    private TypeContact typeContact ; 
    public ContactExt(String name, String lastname, int age, TypeContact typeContact){
        super(name, lastName, age); 
        this.typeContact = typeContact;
    }
    public TypeContract getTypecontact(){
        return typeContract; 
    }
    public void setContact(){
        this.typeContact = typeContact;
    }
    public void Afficher(){
        System.out.println("ContractEXT : "); 
        System.out.println("Name : "+ name + " LastName : "+ lastname + "Age : "+ age  );
        System.out.println("Contract Type of : "+ typeContact.toString());
    }
}