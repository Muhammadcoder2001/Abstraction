package For_while_Dowhile;

public class if_5 {
    public static void main(String[] args) {
        float a = 1.2f;
        float b = 1.9f;
        float c;
        if (a < b){
            c = a;
            a = b;
            b = c;
            System.out.println(a);
            System.out.println(b);
        }
        else {
            System.out.println(a);
            System.out.println(b);
        }

    }
}
