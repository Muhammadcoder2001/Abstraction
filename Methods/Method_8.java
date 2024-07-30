package Methods;

public class Method_8 {
    public static void main(String[] args) {
        System.out.println(selciusToKelvin(36.6) + " Kelvinga teng");
        System.out.println("Area of Triangle is equal to " + areaOfTriangle(5, 7, 9));
    }
    public static double areaOfTriangle(int a, int b, int c){
        double p = (a + b + c) / 2;
        double result ;
        result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return result;

    }
    public static  double selciusToKelvin(double selcius){
        return  selcius + 273;

    }
}
