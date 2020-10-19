/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/19/2020
 * Time: 4:45 PM
 */
public class Employee {
    private int id;
    private String name;
    private String address;
    private int age;
    public static int counter = 1;


    private double luongCung;
    private double luongThuong;
    private double luongPhat;
    private double luongThucLinh;

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(double luongThuong) {
        this.luongThuong = luongThuong;
    }

    public double getLuongPhat() {
        return luongPhat;
    }

    public void setLuongPhat(double luongPhat) {
        this.luongPhat = luongPhat;
    }

    public double getLuongThucLinh() {
        return luongThucLinh;
    }

    public void setLuongThucLinh(double luongThucLinh) {
        this.luongThucLinh = luongThucLinh;
    }

    public Employee() {
        this.id = Employee.counter;
        Employee.counter++;
    }

    public Employee(String name, String address, int age) {
        this.luongCung = 5000000;
        this.id = Employee.counter;
        this.name = name;
        this.address = address;
        this.age = age;
        Employee.counter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
