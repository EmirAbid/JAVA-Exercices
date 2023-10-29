public class TestCompte {
    public static void main(String []args){
        Compte moncpt = new Compte(4555.5);
        moncpt.retirer(555.5);
        moncpt.deposer(2000.0);
        moncpt.afficher();
    }
}