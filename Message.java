import java.util.Scanner;
public class Message{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenu Saisir votre Message");
        String msg = sc.nextLine(); 
        System.out.println("Your Message : "+ msg);
    }
}