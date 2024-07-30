package Birinchi_bosqich;

public class Sqrt_num {
    public static void main(String[] args) {
        int x = 8;
        double result = Math.sqrt(x);

        System.out.println(Math.floor(result));
        System.out.println(ispalindrome(121));
    }
    public static int ispalindrome(int x){
        int result = (int) Math.floor(Math.sqrt(x));
        return result;
//        String str = "";
//        String str2 ="" ;
//        str += x;
//        System.out.println(str);
//        str2 = new StringBuilder(str).reverse().toString();
//        System.out.println(str2);
//        if (str.equals(str2)) {
//            return true;
//        }
//        else {
//            return false;
//        }
//        str2 +=x;
//        while(x > 0){
//            str += x % 10;
//            x /= 10;
//        }
//        if (str.equals(str2)){
//            return true;
//        }
//        else{
//            return false;
        }
    }

