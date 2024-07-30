package Birinchi_bosqich;

public class remove_dublicates {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3};
        String str = "";

        for (int i = 0; i < nums.length; i ++){
            str += nums[i];
        }

        int num = Integer.parseInt(str);
        num += 1;
        String str_num = Integer.toString(num);
        int [] digitArray = new int[str_num.length()];
        for (int i = 0; i <str_num.length(); i++){
            digitArray[i] =Character.getNumericValue(str_num.charAt(i));
            System.out.printf("%d ",digitArray[i]);
        }
    }

}
