import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        //khởi tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);
        // khai báo biến String
        String fullName;
        int age;
        String address;
        System.out.println("mời bạn nhập vào họ tên");
        fullName =scanner.nextLine();
        System.out.println("họ và tên của bạn là "+ fullName);
        System.out.println("mời bạn nhập vào tuổi");
        age = scanner.nextInt();


    }
}
