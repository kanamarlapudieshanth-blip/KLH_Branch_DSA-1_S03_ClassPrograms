import java.util.*;

public class sum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("enter number of elements you need: ");
        int x = input.nextInt();

        int[] elements = new int[x]; 

        for(int i = 0; i < x; i++){
            System.out.println("enter the elements: ");
            elements[i] = input.nextInt();
        }

        int sum = 0;

        for (int num : elements) {
            sum += num;
        }

        double average = sum / elements.length;

        System.out.println("the sum is: " + sum);
        System.out.println("the average is: " + average);
    
    }

}
