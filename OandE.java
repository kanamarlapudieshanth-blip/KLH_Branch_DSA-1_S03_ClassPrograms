import java.util.*;

public class OandE{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("enter number of elements you need: ");
        int x = input.nextInt();

        int[] elements = new int[x]; 

        for(int i = 0; i < x; i++){
            System.out.println("enter the elements: ");
            elements[i] = input.nextInt();
        }

        int counteven = 0;
        int countodd = 0;

        for(int i = 0; i < elements.length; i++){
            if(i % 2 == 0){
                counteven++;
            }
            else{
                countodd++;
            }
        }

        System.out.println("the odd numbers are: " + counteven);
        System.out.println("the odd numbers are: " + countodd);




    }
}



