public class Test{

    public static void main(String [] args){
        Tableau tableau = new Tableau(10); 
        tableau.afficher();
        tableau.recherche(3);
        tableau.Occurence(3);
        tableau.ordonner();
        tableau.afficher();
        tableau.maximum();
        tableau.minimum();
    }   
}