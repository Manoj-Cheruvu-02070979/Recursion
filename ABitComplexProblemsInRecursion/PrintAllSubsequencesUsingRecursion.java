package ABitComplexProblemsInRecursion;
import java.util.ArrayList;

public class PrintAllSubsequencesUsingRecursion {
    private static int[] array;

    public static void print(int index, ArrayList<Integer> list){
        if(index == array.length){
            for(int i: list){
                System.out.print(i + " ");
            }
            if(list.size() == 0 ){
                System.out.println("{}");
            }
            System.out.println();
            return;
        }
        list.add(array[index]);
        print(index + 1, list);
        list.remove(list.size() - 1);
        print(index + 1, list);
    }

    public static void main(String... args){
        PrintAllSubsequencesUsingRecursion printer = new PrintAllSubsequencesUsingRecursion();
        array = new int[]{1, 2, 3};
        printer.print(0, new ArrayList<>());
    }
}
