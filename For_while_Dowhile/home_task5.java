package For_while_Dowhile;

public class home_task5 {
    public static void main(String[] args) {
        int [] list = {10, 25, 33, 20, 18};
        int max = list[0];
        int min = list[0] ;
        for (int i = 1; i < list.length; i ++){
            if (max < list[i]){
                max = list[i];
            }
            if(min > list[i]){
                min = list[i];
            }
        }
        System.out.println("MAx = " + max);
        System.out.println("Min = " + min);
    }
}
