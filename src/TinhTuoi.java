import java.util.Scanner;

public class TinhTuoi {
    public static void main(String[] args) {
        int currentYear = 2018;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao nam sinh: ");
        int birthYear = scanner.nextInt();

        System.out.println("Tuoi cua ban la: " + (currentYear - birthYear));
    }
}
