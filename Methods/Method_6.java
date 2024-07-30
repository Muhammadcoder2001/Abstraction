package Methods;

public class Method_6 {
    public static void main(String[] args) {
        System.out.println(kmToMetr(12) + " km");
        System.out.println(evenOrOdd(128));
        System.out.println(kmSToMs(20));
    }
    public static double kmSToMs(int speed){
        return  speed / 3.6;
    }

    public static String evenOrOdd(int num){
        String str = "";
        if (num % 2 == 0){
            str = "Juft";
        }    else {
            str = "Toq";
        }
        return  str;

    }

    public static double kmToMetr(int km){
        return km * 1000;
    }
}
