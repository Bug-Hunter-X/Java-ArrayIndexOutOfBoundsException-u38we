public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[5] = 10; // This line will throw an ArrayIndexOutOfBoundsException
        System.out.println("This will not be printed.");
    }
}