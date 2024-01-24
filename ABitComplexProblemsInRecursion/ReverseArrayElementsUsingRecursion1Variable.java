package ABitComplexProblemsInRecursion;

public class ReverseArrayElementsUsingRecursion1Variable {
    private static int[] array;
    public static void reverse(int i){
        if(i >= (array.length)/2){
            return;
        }
        swap(i, (array.length) - i - 1);
        reverse(i+1);
    }
    private static void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void printArray() {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String... args){
        ReverseArrayElementsUsingRecursion1Variable reverser = new ReverseArrayElementsUsingRecursion1Variable();
        int[] myArray = {1, 2, 3, 4, 5};
        reverser.array = myArray;
        reverser.reverse(0);
        System.out.println("\nReversed array:");
        reverser.printArray();
    }

}
