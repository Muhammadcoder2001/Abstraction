package Methods;

public class Method_3 {
    public static void main(String[] args) {
        System.out.println(week(12));
    }
    public static String week(int num) {
        String day = "";
        if (num <= 0 || num > 7) {
            day = "Bunday xafta kuni Mavjud emas";
            return day;

        }
        switch (num) {
            case 1:
                return day = "Dushanba";
            case 2:
                return day = "Seshanba";
            case 3:
                return day = "Chorshanba";
            case 4:
                return day = "Payshanba";
            case 5:
                return day = "Jum'a";
            case 6:
                return day = "Shanba";
            case 7:
                return day = "Yakshanba";
        }
        return day ="Bunday xafta kuni yo'q ";
    }
}
