package MultipleRecursion;

public class Fibonacci {
    public static int fib(int n){
        if(n <= 1){
            return n;
        }
        int last = fib(n - 1);
        int secondlast = fib(n - 2);
        return last + secondlast;
    }
    public static void main(String... args){
        System.out.println(fib(4));
    }
}
