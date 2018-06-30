import java.util.Scanner;

public class DiemTrungBinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diem mon Vat Ly la : ");
        double diemVL = scanner.nextDouble();

        System.out.println("Diem mon Hoa Hoc la : ");
        double diemHH = scanner.nextDouble();

        System.out.println("Diem mon Sinh Hoc la : ");
        double diemSH = scanner.nextDouble();

        double diemTB = (diemVL + diemHH + diemSH) / 3;

        System.out.println("Diem trung binh ca 3 mon la : " + diemTB);
        
        
    }
}
