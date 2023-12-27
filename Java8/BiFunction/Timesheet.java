package Java8.BiFunction;

public class Timesheet {
    private int eno;
    private int days;

    public Timesheet(int eno, int days) {
        this.eno = eno;
        this.days = days;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Timesheet [eno=" + eno + ", days=" + days + "]";
    }
}
