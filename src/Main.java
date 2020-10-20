import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/19/2020
 * Time: 4:49 PM
 */
public class Main {
    // Khởi tạo đối tượng Scanner
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ITManagement itManagement = new ITManagement();
        try {
            int choice;
            // Dừng vòng lặp cho đến khi nhập vào là 0
            do {
                System.out.println("------QUẢN LÝ NHÂN VIÊN------");
                System.out.println("1. Thêm mới");
                System.out.println("2. Hiển thị danh sách");
                System.out.println("3. Tính lương");
                System.out.println("4. Hiển thị DSNV lương lớn hơn 8 triệu");
                System.out.print("Nhập vào lựa chọn của bạn: ");
                // Nhập lựa chọn từ bàn phím
                choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 0: // Thoát khỏi chương trình
                        System.exit(0);
                    case 1: // Thêm mới
                        itManagement.add(addEmployee());
                        break;
                    case 2: // Hiển thị danh sách
                        itManagement.show();
                        break;
                    case 3: // Tính lương
                        menuPayroll(itManagement);
                        break;
                    case 4: // Hiển thị danh sách nhân viên lương lớn hơn 8 triệu
                        menuShowSalaryGreaterThan8Million(itManagement);
                        break;
                    default:
                        System.out.println("Lựa chọn không tồn tại!");
                }

            } while (choice != 0);
        } catch (Exception ex) {
            System.out.println("Đã xảy ra lỗi: " + ex.getMessage());
        }
    }

    private static void menuShowSalaryGreaterThan8Million(ITManagement itManagement) {
        System.out.printf("-----\n%s\t%s\t%s\t%s\t%s\t%s\n", "ID", "Họ tên", "Lương cơ bản", "Thưởng", "Phạt", "Lương thực lĩnh");
        for (Employee e : itManagement.employees) {
            if (e.getSalary() > 8000000) {
                System.out.printf("%d\t%s\t%.2f\t%.2f\t%.2f\t%.2f\n", e.getId(), e.getName(), e.getBasic(), e.getBonus(), e.getPenalty(), e.getSalary());
            }
        }
        System.out.println("-----");
    }

    private static Employee addEmployee() {
        System.out.print("Nhập tên: ");
        String name = input.nextLine();

        System.out.print("Nhập địa chỉ: ");
        String address = input.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(input.nextLine());

        Employee e = new Employee(name, address, age);
        return e;
    }

    public static void menuPayroll(ITManagement itManagement) {
        for (Employee e : itManagement.employees) {
            System.out.print("Nhập lương cơ bản của " + e.getName() + ": ");
            double basic = Integer.parseInt(input.nextLine());
            e.setBasic(basic);
            System.out.print("Nhập thưởng của " + e.getName() + ": ");
            double bonus = Integer.parseInt(input.nextLine());
            e.setBonus(bonus);
            System.out.print("Nhập phạt của " + e.getName() + ": ");
            double penalty = Integer.parseInt(input.nextLine());
            e.setPenalty(penalty);

            e.setSalary(getPayroll(basic, bonus, penalty));
        }
    }

    public static double getPayroll(double basic, double bonus, double penalty) {
        double salary = basic + bonus - penalty;
        return salary;
    }
}
