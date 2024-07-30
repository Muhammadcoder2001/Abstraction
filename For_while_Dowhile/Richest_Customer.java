package For_while_Dowhile;

public class Richest_Customer {
    public static void main(String[] args) {
        int [][] lst = {{1, 2, 3, 4}, {1, 2, 5}};
        int MaxWealth = 0;
        for (int[] customer : lst) {
            int wealth = 0;
            for (int money: customer){
                wealth += money;

            }
            if (wealth > MaxWealth){
                MaxWealth = wealth;

            }
        }
        System.out.println(MaxWealth);
    }
}
