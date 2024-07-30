package For_while_Dowhile;

public class Final_valueOfVariable {
    public static void main(String[] args) {
        String [] operations = {"++X", "X++", "X++"};
        int X = 0;
        for (String str : operations){
            if (str.equals("X--") || str.equals("--X")){
                X --;
            } else if (str.equals("X++") || str.equals("X++")) {
                X ++;
            }
        }
        System.out.println(X);
    }
}
