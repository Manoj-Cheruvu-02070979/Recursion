package ABitComplexProblemsInRecursion;

public class ReverseArrayElementsUsingRecursion2Variables {
    int[] array;

    public void reverse(int left, int right) {
        if (left >= right) {
            return;
        }
        swap(left, right);
        reverse(left + 1, right - 1);
    }

    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void printArray() {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String... args){
        ReverseArrayElementsUsingRecursion2Variables reverser = new ReverseArrayElementsUsingRecursion2Variables();
        int[] myArray = {1, 2, 3, 4, 5};
        reverser.array = myArray;
        reverser.reverse(0, myArray.length - 1);
        System.out.println("\nReversed array:");
        reverser.printArray();
    }
}
