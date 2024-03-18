import java.util.Scanner;

public class baitap5 {
    public static void main(String[] args) {
        double Math;
        double Physics;
        double Chemistry;
        double Literature;
        double English;
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập điểm Toán");
        Math = scanner.nextDouble();
        System.out.println("mời bạn nhập điểm Lý");
        Physics = scanner.nextDouble();
        System.out.println("mời bạn nhập điểm Hóa");
        Chemistry = scanner.nextDouble();
        System.out.println("mời bạn nhập điểm Văn");
        Literature = scanner.nextDouble();
        System.out.println("mời bạn nhập điểm Anh");
        English = scanner.nextDouble();

        if (Math < 0 || Math > 10 || Physics < 0 || Physics > 10 || Chemistry < 0 || Chemistry > 10 || Literature < 0 || Literature > 10 || English < 0 || English > 10){
            System.out.println("cần nhập điểm trong khoảng từ 0 đến 10");
            return;
        }

            double average = (Math + Physics + Chemistry + Literature + English) / 5;
        System.out.println("điểm trung bình của bạn là " + average);

        if (average >= 9) {
            System.out.println("xếp loại xuất sắc");


        } else if (average >= 8 && average < 9) {
            System.out.println("xếp loại giỏi");
        } else if (average < 8 && average >= 6.5) {
            System.out.println("xếp loại khá");

        } else if (average >= 5 && average < 6.5) {
            System.out.println("xếp loại trung bình");
        } else {
            System.out.println("xếp loại yếu");
        }

    }
}
