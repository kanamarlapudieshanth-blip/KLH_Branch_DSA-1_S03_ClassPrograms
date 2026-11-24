import java.util.*;

public class copy{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("enter number of elements you need: ");
        int x = input.nextInt();

        int[] elements = new int[x]; 

        for(int i = 0; i < x; i++){
            System.out.println("enter the elements: ");
            elements[i] = input.nextInt();
            System.out.println(elements[i]);
        }

        int[] copy = new int[elements.length];

        for(int i = 0; i < elements.length; i++){
            copy[i] = elements[i];
            System.out.println(copy[i]);
        }

        

    }
}