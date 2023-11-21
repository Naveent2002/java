import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 5, 8, 12, 6, 7, 10, 15};
        System.out.print("Enter the key element to search: ");
        int key = scanner.nextInt();
        int index = searchElement(array, key);
        if (index != -1) {
            System.out.println("Element " + key + " found at index " + index);
        } else {
            System.out.println("Element " + key + " not found in the array");
        }
    }
    private static int searchElement(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i; // Return the index if key is found
            }
        }
        return -1;
    }
}
