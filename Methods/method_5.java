package Methods;

public class method_5 {
    public static void main(String[] args) {
        System.out.println(convertToFarenheit(104));
        System.out.println(lengthOfCircle(10));
        System.out.println(milya(10));
        System.out.println(gepotenuza(4, 3));

    }
    public static double gepotenuza(int a, int b){
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return c;

    }

    public static double milya(double mil){
        double result = mil * (1609.344 / 1000);
        return result;
    }

    public static double lengthOfCircle(int radius){
        return  2 * Math.PI * radius;
    }


    public static double convertToFarenheit(double celsius){
        double farenheit =(celsius -32 ) * 5 / 9;
        return  farenheit;

    }
}
