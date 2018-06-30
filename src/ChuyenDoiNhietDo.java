import java.util.Scanner;

public class ChuyenDoiNhietDo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhiet do C la : ");
        double doC = scanner.nextDouble();

        double doF = ((doC * 9) / 5) + 32;

        System.out.println("Gia tri do F la : " + doF);

    }

}
