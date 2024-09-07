import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InsSortInt {

    public static void main(String[] args) throws FileNotFoundException{
        int[] arr = new int[100000]; 
        int count = 0;

        Scanner scanner = new Scanner(new File("randInts.txt"));
        while (scanner.hasNextInt() && count < arr.length) {
            arr[count] = scanner.nextInt();
            count++;
        }

        insertionSort(arr, count);

        System.out.println("Smallest value: " + arr[0]);
        System.out.println("Largest value: " + arr[count - 1]);
        System.out.println("Entire thing: ");
        for(int i=0; i<count; i++){
            System.out.println(arr[i]);
        }
    }

    public static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

    }
}
