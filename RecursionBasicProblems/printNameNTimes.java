package RecursionBasicProblems;
public class printNameNTimes {
    public static void print(int i, int N){
        if(i > N){
            return;
        }
        System.out.println("Name");
        print(i+1, N);
    }
    public static void main(String[] args){
        print(1, 5);
    }
}