public class begin30 {
    public static void main(String[] args) {
        double radian = 4.5;
        double result = Math.toDegrees(radian);
        System.out.println(result);
        double degree = radian * 180 / Math.PI;
        System.out.println(degree);
    }
}
