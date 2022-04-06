import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int num=8;
        System.out.println(Factorial.factorial(num));

        int palindromeNum=12321;
        System.out.println(Palindrome.palindrome(palindromeNum));

        int fib=3;
        System.out.println(Fibanocci.fibo(fib));

        System.out.println(DistinctCharacters.findCount("cricket"));

        int[] arr={1,22,33,21,55,12,44};
        System.out.println(Arrays.stream(arr).sorted().limit(arr.length-1).max().getAsInt());
    }
}
