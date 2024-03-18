import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        //nhập số từ 0 => 999 đọc thành tiếng anh

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("mời nhập số");
            String chuoi = "";
            int n = Integer.parseInt(scanner.nextLine());
            int hangTram = n / 100;
            int hangChuc = n % 100 / 10;
            int hangDv = n % 10;
            if (n >= 0 && n <= 999) {
                switch (hangTram) {
                    case 1:
                        chuoi = "One Hundred";
                        break;
                    case 2:
                        chuoi = "Two Hundred";
                        break;
                    case 3:
                        chuoi = "Three Hundred";
                        break;
                    case 4:
                        chuoi = "Four Hundred";
                        break;
                    case 5:
                        chuoi = "Five Hundred";
                        break;
                    case 6:
                        chuoi = "Six Hundred";
                        break;
                    case 7:
                        chuoi = "Seven Hundred";
                        break;
                    case 8:
                        chuoi = "Eight Hundred";
                        break;
                    case 9:
                        chuoi = "Nine Hundred";
                        break;

                }
                if (hangChuc >= 2) {
                    switch (hangChuc) {
                        case 2:
                            chuoi += " twenty";
                            break;
                        case 3:
                            chuoi += " thirty";
                            break;
                        case 4:
                            chuoi += " forty";
                            break;
                        case 5:
                            chuoi += " fifty";
                            break;
                        case 6:
                            chuoi += " sixty";
                            break;
                        case 7:
                            chuoi += " seventy";
                            break;
                        case 8:
                            chuoi += " eighty";
                            break;
                        case 9:
                            chuoi += " ninety";
                            break;


                    }
                }
                if (hangChuc == 1) {
                    switch (hangDv) {
                        case 0:
                            chuoi += " ten";
                            break;
                        case 1:
                            chuoi += " eleven";
                            break;
                        case 2:
                            chuoi += " twelve";
                            break;
                        case 3:
                            chuoi += " thirteen";
                            break;
                        case 4:
                            chuoi += " fourteen";
                            break;
                        case 5:
                            chuoi += " fifteen";
                            break;
                        case 6:
                            chuoi += " sixteen";
                            break;
                        case 7:
                            chuoi += " seventeen";
                            break;
                        case 8:
                            chuoi += " eightteen";
                            break;
                        case 9:
                            chuoi += " nineteen";
                            break;
                    }
                }
                if (hangChuc!= 1){
                    switch (hangDv){
                        case 1:
                            chuoi += " One";
                            break;
                        case 2:
                            chuoi += " Two";
                            break;
                        case 3:
                            chuoi += " Three";
                            break;
                        case 4:
                            chuoi += " Four";
                            break;
                        case 5:
                            chuoi += " Five";
                            break;
                        case 6:
                            chuoi += " Six";
                            break;
                        case 7:
                            chuoi += " Seven";
                            break;
                        case 8:
                            chuoi += " Eight";
                            break;
                        case 9:
                            chuoi += " Nine";
                            break;

                    }
                }

                System.out.println(chuoi);


            } else {
                System.out.println("số ngoài khoảng");
            }

        }
    }
}
