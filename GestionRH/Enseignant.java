public class Enseignant extends Personne{
    private Grade grade; 
    public Enseignant(String name , String lastName, int age , Contract contract , Grade grade){
        super(name, lastName, age, grade);
        this.grade = grade ; 
    }
    public Grade getGrade(){
        return grade; 
    }
    public void setGrade(Grade grade){
        this.grade = grade; 
    }
    public void Afficher(){
        System.out.println("Personnel-Enseignant : "); 
        System.out.println("Name : "+ name + " LastName : "+ lastname + "Age : "+ age  );
        System.out.println("Contract Type of : "+ typeContract.toString());
    }
}