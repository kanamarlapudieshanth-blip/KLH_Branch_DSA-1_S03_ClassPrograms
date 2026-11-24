import java.util.*;

public class merge{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("enter number of elements you need: ");
        int x = input.nextInt();

        int[] elementsv1 = new int[x]; 

        for(int i = 0; i < x; i++){
            System.out.println("enter the elements: ");
            elementsv1[i] = input.nextInt();
        }

        System.out.println("enter number of elements you need: ");
        int y = input.nextInt();

        int[] elementsv2 = new int[y];

        for(int i = 0; i < y; i++){
            System.out.println("enter the elements: ");
            elementsv2[i] = input.nextInt();
            System.out.println(elementsv2[i]);
        }

        int[] merge = new int[elementsv1.length + elementsv2.length];
        
        for(int i = 0; i < elementsv1.length; i++){
            merge[i] = elementsv1[i];
        }

        for(int i = 0; i < elementsv2.length; i++){
            merge[elementsv1.length + i] = elementsv2[i];
        }

        for(int i = 0; i < merge.length; i++){
            System.out.println(merge[i]);
        }

    }
}

    