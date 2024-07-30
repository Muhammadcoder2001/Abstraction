package For_while_Dowhile;

public class home_task3 {
    public static void main(String[] args) {
        int [] arr = {2, 5, 16, 8, 9};
        System.out.println(isAscending(arr));

    }
    public static boolean isAscending(int [] arr){
        for (int i = 1; i < arr.length; i++){
            if ( arr[i] < arr[i - 1]){
                return false;
            }
        }
        return true;
    }
}
