package RecursionBasicProblems;

public class printLinearNumbersButBackTrack {
    public static void print(int i, int N){
        if(i < 1){
            return;
        }
        print(i-1, N);
        System.out.println(i);
    }
    public static void main(String... args){
        print(3, 3);
    }
}
