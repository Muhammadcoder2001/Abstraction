package Methods;

public class method_4 {
    public static void main(String[] args) {
        System.out.println(Add_numbers(345));
    }
    public static int Add_numbers(int num){
        int sum = 0;
        if (num < 10){
            return num;
        }
        while(num > 0){
            sum += num % 10;
            num /= 10;

        }
        return  sum;
    }
}
