import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/19/2020
 * Time: 4:49 PM
 */
public class Main {
    // Khoi tao doi tuong Scanner
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ITManagement itManagement = new ITManagement();
        try {
            int choice;
            // Dung vong lap cho den khi nhap vao la 0
            do {
                System.out.println("================================");
                System.out.println("Quan ly Nhan Vien by AnhNBT (1.0)");
                System.out.println("================================");
                System.out.println("1) Them nhan vien");
                System.out.println("2) Danh sach nhan vien");
                System.out.println("3) Tinh luong nhan vien");
                System.out.println("4) DSNV luong > 8 trieu");
                System.out.println("6) Sap xep luong tang dan");
                System.out.print("Nhap lua chon cua ban (0-Thoat) [ENTER]: ");

                choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 0:
                        System.exit(0); // Thoat khoi chuong trinh
                    case 1:
                        itManagement.add(addEmployee()); // Them nhan vien
                        break;
                    case 2:
                        itManagement.show(); // Hien thi danh sach
                        break;
                    case 3:
                        menuPayroll(itManagement); // Tinh luong
                        break;
                    case 4:
                        menuShowSalaryGreaterThan8Million(itManagement);
                        break;
                    default:
                        System.out.println("Lua chon khong ton tai!");
                }

            } while (choice != 0);
        } catch (Exception ex) {
            System.out.println("Da xay ra loi: " + ex.getMessage());
        }
    }

    private static void menuShowSalaryGreaterThan8Million(ITManagement itManagement) {
        System.out.printf("-----\n%s\t%s\t%s\t%s\t%s\t%s\n", "ID", "Họ tên", "Lương cơ bản", "Thưởng", "Phạt", "Lương thực lĩnh");
//        for (Employee e : itManagement.employees) {
//            if (e.getSalary() > 8000000) {
//                System.out.printf("%d\t%s\t%.2f\t%.2f\t%.2f\t%.2f\n", e.getId(), e.getName(), e.getBasic(), e.getBonus(), e.getPenalty(), e.getSalary());
//            }
//        }
        System.out.println("-----");
    }

    private static Employee addEmployee() {
        System.out.print("Nhap ten [ENTER]: ");
        String name = input.nextLine();

        System.out.print("Nhap dia chi [ENTER]: ");
        String address = input.nextLine();

        System.out.print("Nhap tuoi [ENTER]: ");
        int age = Integer.parseInt(input.nextLine());

        return new Employee(name, address, age);
    }

    public static void menuPayroll(ITManagement itManagement) {
        System.out.print("Nhap ID muon tinh luong [ENTER]: ");
        int id = Integer.parseInt(input.nextLine());
        Employee employee = itManagement.get(id);

        System.out.print("Nhap luong co ban cua " + employee.getName() + " [ENTER]: ");
        double basic = Integer.parseInt(input.nextLine());

        System.out.print("Nhap thuong cua " + employee.getName() + " [ENTER]: ");
        double bonus = Integer.parseInt(input.nextLine());

        System.out.print("Nhap phat cua " + employee.getName() + " [ENTER]: ");
        double penalty = Integer.parseInt(input.nextLine());

        employee.setSalary(itManagement.getPayroll(basic, bonus, penalty));
    }
}