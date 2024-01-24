public class infiniteRecursion {
    public static void f(){
        System.out.println("foo");
        f();
    }
    public static void main(String[] args){
        f();
    }
}