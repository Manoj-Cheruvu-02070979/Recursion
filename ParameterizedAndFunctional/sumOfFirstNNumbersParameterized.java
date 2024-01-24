package ParameterizedAndFunctional;

public class sumOfFirstNNumbersParameterized {
    public static int sum(int i, int sum){
        if(i < 1){
            System.out.println(sum);
            return 0;
        }
        return sum(i - 1, sum + i);
    }
    public static void main(String... args){
        sum(3, 0);
    }
}
