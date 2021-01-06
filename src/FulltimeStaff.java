public class FulltimeStaff extends Staff{
    private int bonus;
    private int five;
    private int salary;



    public FulltimeStaff(int ID, String name, int age, int numberPhone, String email, int bonus, int five, int salary) {
        super(ID, name, age, numberPhone, email);
        this.bonus = bonus;
        this.five = five;
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getFive() {
        return five;
    }

    public void setFive(int five) {
        this.five = five;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int totalSolary() {
        return bonus + salary - five;
    }

    @Override
    public String toString() {
        return "FulltimeStaff{" + super.toString() +
                ", bonus=" + bonus +
                ", five=" + five +
                ", salary=" + salary +
                '}';
    }
}
