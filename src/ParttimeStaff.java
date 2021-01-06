public class ParttimeStaff extends Staff{
    private int timeWork;

    public ParttimeStaff(int timeWork) {
        this.timeWork = timeWork;
    }

    public ParttimeStaff(int ID, String name, int age, int numberPhone, String email, int timeWork) {
        super(ID, name, age, numberPhone, email);
        this.timeWork = timeWork;
    }

    public int getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(int timeWork) {
        this.timeWork = timeWork;
    }

    @Override
    public int totalSolary() {
        return timeWork*100;
    }

    @Override
    public String toString() {
        return "ParttimeStaff{" +
                super.toString() +
                ", timeWork=" + timeWork +
                '}';
    }
}
