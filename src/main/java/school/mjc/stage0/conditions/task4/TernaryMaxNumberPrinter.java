package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int gr_one = first > second && first > third ? first : second;
        int gr_two = gr_one > third ? gr_one : third;
        System.out.println(gr_two);
    }
}
