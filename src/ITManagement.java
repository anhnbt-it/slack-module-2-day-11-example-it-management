import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/19/2020
 * Time: 5:11 PM
 */
public class ITManagement {
    ArrayList<Employee> employees;
    public ITManagement() {
        this.employees = new ArrayList<>();
    }

    public void add(Employee e) {
        employees.add(e);
    }

    public void show() {
        for (Employee e : employees) {
            System.out.println(e.toString());
        }
    }
}
