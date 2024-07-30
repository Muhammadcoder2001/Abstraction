package For_while_Dowhile;

public class home_task2 {
    public static void main(String[] args) {
        int [] arr = {10, 25, 33, 20, 18};
        int summa = 0;
        for (int i = 0; i < arr.length; i ++){
            summa+= arr[i];
        }
        System.out.println("Summa of array: " + summa);
    }
}
