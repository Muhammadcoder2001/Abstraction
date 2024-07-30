package For_while_Dowhile;

public class home_task10 {
    public static void main(String[] args) {
        int birthYear = 1991, birthMonth = 5,  birthday = 28;
        int currentYear = 2024, currentMonth = 7, currentDay = 21;
        int day = birthday - currentDay;
        int month = birthMonth - currentMonth;
        int year = currentYear - birthYear;
        if (day < 0) {
            day *= 30 + day;
            month -= 1;
        } else if (month < 0) {
            month =12 + month;
            year -= 1;
        }
        System.out.println("Year " + year + "  Month " + month + "  Day " + day);

    }
}
