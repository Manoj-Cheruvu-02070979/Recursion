package RecursionBasicProblems;

public class printNumbersInReverseButBackTrack {
    public static void print(int i, int N){
        if(i > N){
            return;
        }
        print(i+1, N);
        System.out.println(i);
    }
    public static void main(String[] args){
        print(1, 3);
    }
}
