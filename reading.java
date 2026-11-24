import java.util.*;

public class reading{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("enter number of elements you need: ");
        int x = input.nextInt();

        int[] elements = new int[x]; 

        for(int i = 0; i < x; i++){
            System.out.println("enter the elements: ");
            elements[i] = input.nextInt();
        }

        for(int i = 0; i < x; i++){
            System.out.print(elements[i]);
        }

        for (int i = x - 1; i >= 0; i--) {
            System.out.print(elements[i] + " ");}
        

        







    }
}