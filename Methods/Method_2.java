package Methods;

public class Method_2 {
    public static void main(String[] args) {

        show(12, "Hello World");
        show_add(126, 24);
        Rectangular(4, 6);
        int a = 5, b = 6;
        multiply(a, b);
        char [] arr = {'d', 'a', 's', 't', 'u', 'r', 'l', 'a', 's', 'h', '.', 'u', 'z'};
        System.out.println(convertToString(arr));
        System.out.println(Symbol(0));

    }

    public static void show(int num, String str) {
        System.out.println(num  + " "+ str);
    }
    public static void show_add(int num, int a){
        System.out.println(num + a);
    }
    public static void Rectangular(int a , int b){
        System.out.println("P = " + 2 * (a + b));

    }
    public static void multiply(int n, int m){
        System.out.println(n * m);
    }
    public static String convertToString(char [] lst){
        String character = "";
        for (Character ch : lst){
            character += ch;
        }
        return character;
    }
    public static String Symbol(int number){
        String ishora = "";
        if (number >= 0){
            ishora = "Musbat";
        }
        else {
            ishora = "Manfiy";

        }
        return ishora;
    }
}
