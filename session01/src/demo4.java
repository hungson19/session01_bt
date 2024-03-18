import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        //Nhập vào kí tự bất kỳ xem đó là nguyên âm hay phụ âm

        //khởi tạo đối tương Scanner
        Scanner scanner = new Scanner(System.in);
        // khởi tạo biến String
        String string;
        System.out.println("mời bạn nhập chữ");
        string = scanner.nextLine();
        switch (string) {
            case "u":
                System.out.println("đây là nguyên âm");
                break;
            case "e":
                System.out.println("đây là nguyên âm");
                break;
            case "o":
                System.out.println("đây là nguyên âm");
                break;
            case "a":
                System.out.println("đây là nguyên âm");
                break;
            case "i":
                System.out.println("đây là nguyên âm");
                break;
            default:
                System.out.println("đây là phụ âm");
                break;
        }

    }
}
