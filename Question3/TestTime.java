package Question3;

public class TestTime {
    public static void main(String[] args) {
    // Two Objects
    Time t1 = new Time(21, 10, 15);
    Time t2 = new Time(10, 20, 25);

    // Starting Times
    System.out.println("T1 Time: " + t1);
    System.out.println("T2 Time: " + t2);

    // nextSecond() for t1
    t1.nextSecond();
    System.out.println("nextSecond t1: " + t1);

    // previousSecond() for t2
    t2.previousSecond();
    System.out.println("previousSecond t2: " + t2);
    }
}