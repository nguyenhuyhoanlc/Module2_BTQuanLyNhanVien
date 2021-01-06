import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.*;


public class ManagerOfStaff {
    List <Staff> staffList = new ArrayList<>();

    public void addStaft(Staff staff) {
        staffList.add(staff);
    }
    public void showAll(){
        for (Staff s: staffList) {
            if(s instanceof FulltimeStaff){
                FulltimeStaff fulltimeStaff = (FulltimeStaff) s;
                System.out.println(fulltimeStaff);
            }
            if(s instanceof ParttimeStaff){
                ParttimeStaff parttimeStaff = (ParttimeStaff) s;
                System.out.println(parttimeStaff);
            }
        }
    }
    public void showAllStaffHaveSalaryLessAvg(){
       double avgSalary = takeAvgSalary();
        boolean testSalary = false;
        for (Staff s : staffList) {
            if(s instanceof FulltimeStaff){
                FulltimeStaff fulltimeStaff = (FulltimeStaff) s;
                testSalary = fulltimeStaff.getSalary() < avgSalary;
                if(testSalary){
                    System.out.println(fulltimeStaff);
                    break;
                }
            }
        }
        if(!testSalary){
            System.err.println("Not exits");
        }
    }
    public void totalParttime(){
        double sumParttime = 0;
        for (Staff s: staffList) {
            if (s instanceof ParttimeStaff){
                ParttimeStaff parttimeStaff = (ParttimeStaff) s;
                sumParttime += parttimeStaff.totalSolary();
            }
        }
        System.out.println(sumParttime);
    }

    private double takeAvgSalary() {
        double avgSalary = 0;
        int count = 0;
        double sumSalary = 0;
        for (int i = 0; i < staffList.size(); i++) {
            Staff staff = staffList.get(i);
            if(staff instanceof FulltimeStaff){
                FulltimeStaff fulltimeStaff = (FulltimeStaff) staff;
                sumSalary += fulltimeStaff.getSalary();
                count++;
            }
        }
        avgSalary = sumSalary/count;
        return avgSalary;
    }
    public ArrayList<FulltimeStaff> showAllFullTimeStaff(){
        ArrayList<FulltimeStaff> fulltimeStaffArrayList = new ArrayList<>();
        for (int i = 0; i < staffList.size(); i++) {
            Staff staff = staffList.get(i);
            if (staff instanceof FulltimeStaff){
                FulltimeStaff fulltimeStaff = (FulltimeStaff) staff;
                fulltimeStaffArrayList.add(fulltimeStaff);
            }
        }
        return fulltimeStaffArrayList;
    }

    public void sortFulltimeStaffBySalary() {
        ArrayList<FulltimeStaff> fulltimeStaffArrayList = showAllFullTimeStaff();
        for (int i = 0; i < fulltimeStaffArrayList.size(); i++) {
            Collections.sort(fulltimeStaffArrayList, new Comparator<FulltimeStaff>() {
                @Override
                public int compare(FulltimeStaff o1, FulltimeStaff o2) {
                    if (o1.getSalary() > o2.getSalary() ) return 1;
                    if(o1.getSalary() < o2.getSalary()) return -1;
                    else return 0;
                }
            });
        }
    }

}
