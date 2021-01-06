import java.util.Scanner;

public class MainTest {
    static ManagerOfStaff managerOfStaff = new ManagerOfStaff();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. add new");
            System.out.println("2. Show all");
            System.out.println("3.show all FullTimeStaff Have Salary Less Avg salary");
            System.out.println("4. show total salary of all ParttimeStaff");
            System.out.println("5. sort fullTimeStaff by salary");
            System.out.println("0. exit program");
            System.out.println("enter choice");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    addNew();
                    break;
                case 2:
                    managerOfStaff.showAll();
                    break;
                case 3:
                    managerOfStaff.showAllFullTimeStaff();
                    break;
                case 4:
                    managerOfStaff.totalParttime();
                    break;
                case 5:
                    managerOfStaff.sortFulltimeStaffBySalary();
                    break;
                case 0:
                    System.out.println("Exit program");
                    break;
            }

        } while (choice != 0);
    }

    public static void addNew() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc1.nextLine();
        System.out.println("Enter ID");
        int ID = sc1.nextInt();
        System.out.println("Enter age");
        int age = sc1.nextInt();
        System.out.println("Enter numberPhone");
        int numberPhone = sc1.nextInt();
        System.out.println("Enter email");
        String email = sc1.nextLine();
        boolean fulltimeStaff1 = true;
        boolean parttimeStaff1 = true;
        do {
            System.out.println("Nhập kiểu nhân viên là [FulltimeStaff,PartTimeStaff]");
            String kindOfStaff = sc.nextLine();
            fulltimeStaff1 = kindOfStaff.equalsIgnoreCase("FulltimeStaff");
            if (fulltimeStaff1) {
                System.out.println("Enter Bonus");
                int Bonus = sc.nextInt();
                System.out.println("Enter Five");
                int Five = sc.nextInt();
                System.out.println("Enter Salary");
                int Salary = sc.nextInt();
                FulltimeStaff fulltimeStaff = new FulltimeStaff(ID, name, age, numberPhone, email, Bonus, Five, Salary);
                managerOfStaff.addStaft(fulltimeStaff);
            }
            parttimeStaff1 = kindOfStaff.equalsIgnoreCase("ParttimeStaff");
            if (parttimeStaff1) {
                System.out.println("Enter timeWork");
                int timeWork = Integer.parseInt(sc1.nextLine());
                ParttimeStaff parttimeStaff = new ParttimeStaff(ID, name, age, numberPhone, email, timeWork);
                managerOfStaff.addStaft(parttimeStaff);
            }
        }while (!fulltimeStaff1&&!parttimeStaff1);
    }

}