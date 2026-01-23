import java.time.LocalDate;

public class Exam5 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1999, 4, 16);
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int dayOfmonth = localDate.getDayOfMonth();

        System.out.println("私の誕生日は" + year + "年" + month + "月" + dayOfmonth + "日です");

    

        
    }
}
