import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter size Array: ");
        int size = Integer.parseInt(in.nextLine());
        Random random = new Random();
        int[] arrayINT = random.ints(size,10,99999).toArray();
        Arrays.sort(arrayINT);

        for (int i = 0; i < size; i++) {
            System.out.println(arrayINT[i]);
        }
        System.out.println("Enter the search key: ");
        int num = Integer.parseInt(in.nextLine());

        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarySearchArr(arrayINT,num));

    }



}
