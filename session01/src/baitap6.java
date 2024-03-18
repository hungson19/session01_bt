import java.util.Scanner;

public class baitap6 {
    public static void main(String[] args) {
        int numberCheck;
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập số");
        numberCheck = scanner.nextInt();
        if (numberCheck % 3 == 0 && numberCheck % 5 == 0) {
            System.out.println("Chia hết cho cả 3 và 5");
        }
        if (numberCheck % 3 == 0 && numberCheck % 5 != 0) {
            System.out.println("Chỉ chia hết cho 3");
        }
        if (numberCheck % 3 != 0 && numberCheck % 5 == 0) {
            System.out.println("Chỉ chia hết cho 5");
        }
        if (numberCheck % 3 != 0 && numberCheck % 5 != 0) {
            System.out.println("Không chia hết cho 3 , cũng không chia hết cho 5");
        }

    }
}
