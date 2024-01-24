package RecursionBasics.RecursionBasicProblems;

public class printLinearNumbers {
    public static void print(int i, int N){
        if(i > N){
            return;
        }
        System.out.println(i);
        print(i+1, N);
    }
    public static void main(String[] args){
        print(1, 5);
    }
}
