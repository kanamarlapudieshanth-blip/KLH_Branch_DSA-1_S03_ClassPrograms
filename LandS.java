import java.util.*;

public class LandS{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("enter number of elements you need: ");
        int x = input.nextInt();

        int[] elements = new int[x]; 

        for(int i = 0; i < x; i++){
            System.out.println("enter the elements: ");
            elements[i] = input.nextInt();
        }

        int max = elements[0]; 
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > max) {
                max = elements[i];
            }
        }

        int min = elements[0];
        for(int i = 0; i < elements.length;i++){
            if(elements[i] < min){
                min = elements[i];
            }
        } 

        System.out.println("the largest is: " + max);
        System.out.println("the smallest is: " + min);


    }
}
