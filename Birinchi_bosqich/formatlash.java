import java.util.Locale;

public class formatlash {
    public static void main(String[] args) {
        System.out.printf("  '%s' %n", "Salom Dunyo");
        System.out.printf("  '%S' %n", "Salom Dunyo");
        System.out.printf("'%-15s' %n", "Salom Dunyo");
        System.out.printf("'%15S' %n", "Salom Dunyo");
        System.out.printf("'%2.1s' %n", "Salom Dunyo");
        System.out.printf(Locale.US, "Locale.US ==> %,d%n", 123000);
        System.out.printf(Locale.UK, "Locale.UK ==> %,d%n", 123000);
        System.out.printf(Locale.ITALIAN, "Locale>italian==> %,d%n", 123000);
        System.out.printf("%1$f%n%1$.4f%n%1$.2f%n", Math.PI);


    }
}
