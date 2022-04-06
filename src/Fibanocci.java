public class Fibanocci {
    public static int fibo(int num){
        int f;
        if(num==0)
            return 0;
        else if (num==1)
            return 1;
        else {
            f= fibo(num-1)+fibo(num-2);
        }return f;
    }
}
