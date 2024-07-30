package For_while_Dowhile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class while_5 {
    public static void main(String[] args) {
        int f0 = 0, f1 = 1, f2 = 0;
        int i = 0;
        int [] lst= new int[10];
        while(i < 10){
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
            i++;
        }
        System.out.println(f2);
    }
}
