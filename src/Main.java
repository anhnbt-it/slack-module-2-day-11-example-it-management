import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/19/2020
 * Time: 4:49 PM
 */
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ITManagement itManagement = new ITManagement();
        do {
            System.out.println("------QUAN LY NHAN VIEN------");
            System.out.println("1. Them nhan vien");
            System.out.println("2. Hien thi tat ca nhan vien");
            System.out.println("3. Tinh luong cho moi nhan vien");
            System.out.print("Nhap vao lua chon cua ban: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    addMenu(itManagement);
                    break;
                case 2:
                    itManagement.show();
                    break;
                case 3:
                    break;
            }

        } while (true);
    }

    private static void addMenu(ITManagement itManagement) {
        Employee e = new Employee();
        System.out.print("Nhap vao ten nhan vien: ");
        String name = sc.nextLine();
        e.setName(name);

        System.out.print("Nhap vao dia chi: ");
        String address = sc.nextLine();
        e.setAddress(address);

        System.out.print("Nhap vao tuoi: ");
        int age = Integer.parseInt(sc.nextLine());
        e.setAge(age);

        itManagement.add(e);
    }
}
