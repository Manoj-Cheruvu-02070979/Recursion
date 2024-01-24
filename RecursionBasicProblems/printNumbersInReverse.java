package RecursionBasics.RecursionBasicProblems;

public class printNumbersInReverse {
    public static void print(int i, int N){
        if(i < 1){
            return;
        }
        System.out.println(i);
        print(i - 1, N);
    }
    public static void main(String[] args){
        print(3, 3);
    }
}
