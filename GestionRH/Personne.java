abstract class Personne{
    protected String name; 
    protected String lastname; 
    protected int age ;
    protected Personne(String name, String lastname , int age ){
        this.name = name; 
        this.lastname = lastname ;
        this.age = age ;  
    } 
    protected String get_Name(){
        return this.name;
 
   }
    protected void set_Name(String name){
        this.name = name;
   }
    protected String get_lastName(){
        return this.lastname;

    }
    protected void set_lastName(String lastname){
    this.lastname = lastname;
    }
    protected int get_Age(){
        return this.age;
 
   }
   protected void set_Age(int age){
        this.age = age;
   }
}