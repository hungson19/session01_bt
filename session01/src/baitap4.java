import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length;
        double width;
        System.out.println("mời bạn nhập chiều dài");
        length = scanner.nextDouble();
        System.out.println("mời bạn nhập chiều rộng");
        width = scanner.nextDouble();
        System.out.println("chu vi hình chữ nhật là " + (length + width) * 2);
        System.out.println("diện tích hình chữ nhật là " + length * width);
    }
}
