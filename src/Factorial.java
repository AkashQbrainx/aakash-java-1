public class Factorial {
    public static int factorial(int num){
       int fact;
        if(num<0) return 0;
       else  if(num==1) return 1;
        else
          fact=num*factorial(num-1);
        return fact;
    }
}
