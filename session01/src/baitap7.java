import java.util.Scanner;

public class baitap7 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" mời bạn nhập số");
        number = scanner.nextInt();
        switch (number) {
            case 0:
                System.out.println("Số 0");
                break;
            case 1:
                System.out.println("Số một");
                break;
            case 2:
                System.out.println("Số hai");
                break;
            case 3:
                System.out.println("Số ba");
                break;
            case 4:
                System.out.println("Số bốn");
                break;
            case 5:
                System.out.println("Số năm");
                break;
            case 6:
                System.out.println("Số sáu");
                break;
            case 7:
                System.out.println("Số bảy");
                break;
            case 8:
                System.out.println("Số tám");
                break;
            case 9:
                System.out.println("Số chín");
                break;
            default:
                System.out.println("số bạn nhập không hợp lệ");
                break;
        }

    }
}
