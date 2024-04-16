public class Administratif extends Personne{
    private Post poste; 
    public Administratif(String name , String lastName, int age , Contract contract , Post post){
        super(name, lastName, age, post);
        this.post = post ; 
    }
    public Grade getPost(){
        return poste; 
    }
    public void setPost(Post poste){
        this.post = post; 
    }
    public void Afficher(){
        System.out.println("Personnel-Administratif : "); 
        System.out.println("Name : "+ name + " LastName : "+ lastname + "Age : "+ age  );
        System.out.println("Contract Type of : "+ typeContract.toString());
    }
}