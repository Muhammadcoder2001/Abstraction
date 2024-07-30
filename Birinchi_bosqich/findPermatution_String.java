package Birinchi_bosqich;

public class findPermatution_String {
    public static void main(String[] args) {
        String str ="abc", str2 = "bac";
        int result = 0;
        for (int i = 0; i < str.length(); i++){
            int current_num = Math.abs(i - (str.length() -i));
            result += current_num;
        }
        System.out.println(result);

    }
}
