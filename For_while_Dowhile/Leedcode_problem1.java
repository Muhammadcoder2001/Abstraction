package For_while_Dowhile;

import java.util.Arrays;

public class Leedcode_problem1 {
    public static void main(String[] args) {
        int [] nums = {1,2, 3};
        int length = nums.length * 2;
        int [] arr = new int[length];
        int pos = 0;
        for (int element : nums){
            arr[pos] = element;
            pos ++;
        }
        for (int element : nums){
            arr[pos] = element;
            pos ++;
        }
        System.out.println(Arrays.toString(arr));


    }
}
