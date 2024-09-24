package Question2;

public class TestDate {
    public static void main(String[] args) {
        Date myDate = new Date(23, 04, 2003);
        System.out.println("Date:" + myDate.toString());

        myDate.setDay(28);
        myDate.setMonth(04);
        myDate.setYear(2003);

        System.out.println("New Date:" + myDate.toString());
    }
}
