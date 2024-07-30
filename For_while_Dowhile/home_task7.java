package For_while_Dowhile;

public class home_task7 {
    public boolean checkPassword(String password){
        if (password.length() < 8){
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        boolean hasLowerCase = false;

        for (char i : password.toCharArray()){
            if (Character.isUpperCase(i)){
                hasUpperCase = true;
            } else if (Character.isLowerCase(i)) {
                hasLowerCase = true;
            } else if (Character.isDigit(i)) {
                hasDigit = true;
            } else if ("!@#$%^&*".indexOf(i) >= 0) {
                hasSpecialChar = true;
            }
        }
        return hasDigit && hasLowerCase && hasUpperCase && hasSpecialChar;

    }
    public static void main(String[] args) {

       String  str = "Abcd123qduhjq@";
       home_task7 identity = new home_task7();
       System.out.println(identity.checkPassword(str));



    }
}
