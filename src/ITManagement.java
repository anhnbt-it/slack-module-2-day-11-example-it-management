import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/19/2020
 * Time: 5:11 PM
 */
public class ITManagement implements Comparator<Employee> {
    private ArrayList<Employee> employees;
    public ITManagement() {
        this.employees = new ArrayList<>();
    }

    public void add(Employee e) {
        employees.add(e);
    }

    public void show() {
        System.out.println("=================================");
        System.out.println("\t\tDANH SÁCH NHÂN VIÊN");
        System.out.println("=================================");
        if (employees.size() > 0) {
            for (Employee e : employees) {
                System.out.println(e.toString());
            }
        } else {
            System.out.println("Danh sanh trong!");
        }
    }

    public boolean remove() {
        System.out.println("Ban muon xoa nhan vien nay? [y/N]");
        return true;
    }

    public Employee get(int id) {
        return employees.get(id);
    }

    public double getPayroll(double basic, double bonus, double penalty) {
        return basic + bonus - penalty;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return (o1.getSalary() > o2.getSalary()) ? -1 : 1;
    }
}
