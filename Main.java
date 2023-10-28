import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Rectangle[] rectangles  = new Rectangle[3];
        Scanner input = new Scanner(System.in);
        for (int i =0 ; i < rectangles.length; i++){
            System.out.println("Do want to enter the width and the height");
            char choice = input.next().charAt(0); // y/n
            if ( choice == 'y')
                rectangles[i] = new Rectangle(input.nextDouble(), input.nextDouble());
            else 
                rectangles[i] = new Rectangle();
        }
        System.out.println("These are the Rectangles");
        for(int i=0 ; i < rectangles.length; i++){
            System.out.println("Rectangles: " + i+1 + "Width: "+ rectangles[i].getWidth()+"," +" Height : "+ rectangles[i].getHeight()  );
        }
    }
}