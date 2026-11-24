import java.util.*;

public class search{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("enter number of elements you need: ");
        int x = input.nextInt();

        int[] elements = new int[x]; 

        for(int i = 0; i < x; i++){
            System.out.println("enter the elements: ");
            elements[i] = input.nextInt();
        }
        boolean found = false;

        System.out.println("enter the element you want to search: ");
        int search = input.nextInt();

        for(int i = 0; i < elements.length; i++){
            if(elements[i] == search){
                found = true;
                break;
            }
        }

        if(found){
            System.out.println("element is found");
        }
        else{
            System.out.println("element not found");
        }

    }
}

