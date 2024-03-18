import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        //khởi tạo Scanner
        Scanner scanner = new Scanner(System.in);
        // khai báo biến tỉ giá
        int rate = 23000;
        int usd;
        System.out.println("mời bạn nhập số USD cần đổi");
        usd = Integer.parseInt(scanner.nextLine());

        System.out.println(usd + "usd = " + usd * rate + "vnd");


    }
}
