public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (0 <= 4 && 4 < arr.length) {
            arr[4] = 10; //Corrected index
        } else {
            System.out.println("Index out of bounds");
        }
        System.out.println("This will be printed.");
    }
}