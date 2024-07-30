package For_while_Dowhile;

public class while1 {
    public static void main(String[] args) {
        int n = 123;
        String str = "";
        while(n > 0){
            str += n % 10;
            n = n / 10;
        }
        int result = Integer.parseInt(str);
        System.out.println(result);
    }
}
