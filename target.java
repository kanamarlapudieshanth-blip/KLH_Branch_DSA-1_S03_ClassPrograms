import java.util.*;

public class target{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("enter number of elements you need: ");
        int x = input.nextInt();

        int[] elements = new int[x]; 

        for(int i = 0; i < x; i++){
            System.out.println("enter the elements: ");
            elements[i] = input.nextInt();
        }

        System.out.println("Enter a target: ");
        int target = input.nextInt();

        for(int i = 0; i < elements.length; i++){
            for(int j = i + 1; j < elements.length; j++){
                if(elements[i] + elements[j] == target){
                    System.out.println();
                }

            }
        }

    }
}
