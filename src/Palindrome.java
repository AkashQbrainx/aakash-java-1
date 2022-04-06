public class Palindrome {
    public static String palindrome(int num){
        int rev=0;
        int org=num;
        while (num!=0){
            int temp=num%10;
            rev=temp+rev*10;
            num=num/10;
        }
        if(org==rev)
            return "Is palindrome";
        else
            return "Not a palindrome";
    }
}
