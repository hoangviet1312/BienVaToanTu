import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float tiGia = 23000f;
        float soUSD;
        float tienViet;

        System.out.println("Số tiền USD là : ");
        soUSD = scanner.nextFloat();

        tienViet = soUSD * tiGia;
;
        System.out.println("So tien Viet la : " + tienViet);
    }
}
