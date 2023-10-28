import java.util.Scanner;
public class MaxInteger{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int nb1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int nb2 = sc.nextInt();
        System.out.println("Max : "+ maximum(nb1,nb2));
    }
    // A static method means that it can be accessed without creating an object of the class, unlike public
    public static int maximum(int nb1, int nb2){
        if (nb1 > nb2 ){
            return nb1;
        } else {
            return nb2; }
    }
}