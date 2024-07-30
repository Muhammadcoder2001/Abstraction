package For_while_Dowhile;

import java.util.Arrays;
//import java.util.ArrayList;

public class home_task1 {
    public static void main(String[] args) {
        int [] myNums = {1, 33, 2, 9, 11, 22};
        int max1 = myNums[0];
        int max2 = 0;

        for (int i = 1; i < myNums.length; i ++){
            if( myNums[i] > max1) {
                max1 = myNums[i];
            }
        }
        for (int i = 0; i < myNums.length; i++){
            if (myNums[i] < max1 && myNums[i] > max2){
                max2 = myNums[i];

            }

        }
        System.out.println("Max1 = " + max1);
        System.out.println("Max2 = " + max2);
    }
}
