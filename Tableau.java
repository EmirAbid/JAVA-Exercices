public class Tableau{
    int[] tab;
    public Tableau(int n){
        tab = new int[n]; 
        for(int i=0; i < tab.length; i++ ){
            tab[i] =  (int) (Math.random()*10+1);
        }
    }
    public void afficher(){
        for(int i=0 ; i < tab.length; i++ ){
            System.out.print( tab[i]+ "  ");
        }
        System.out.println("Finish !!");
    }
    public void recherche(int x){
        int ind = -1 ; 
        for (int i=0 ; i< tab.length ; i++){
            if( tab[i] == x)
                ind = i;
                break; // Probleme
        }
        if (ind > -1) 
            System.out.println(x + " exist with index : "+ ind );
        else 
            System.out.println( x+ " not exist");
    }
    public void Occurence(int x){
        int j =  0 ;
        for (int i=0 ; i<tab.length ; i++){
            if( tab[i] == x)
                j ++;
        }
        System.out.println("Occurence of element "+ x +" is : "+ j);
    }
    public int Somme(){
        int  s = 0; 
        for (int i=0 ; i< tab.length ; i++){
            s += tab[i];
        }
        return s; 
    }
    public double Moyenne(){
        int s = Somme();
        double moy = (double)(s) / tab.length ; 
        return moy;
    }
    public void ordonner(){
        int aux; 
        for(int i =0; i< tab.length ; i++){
            for(int j= 1 ; j<tab.length-i ; j++){
                if (tab[j-1] > tab[j]){
                    aux = tab[j-1] ;
                    tab[j-1]= tab[j]; 
                    tab[j] = aux;
                }
                    
            }
        }
    }
    public void maximum(){
        System.out.println("Max: "+tab[tab.length-1]);
    }
    public void minimum(){
        System.out.println("Min: "+tab[0]);
    }

}
