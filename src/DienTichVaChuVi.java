import java.util.Scanner;

public class DienTichVaChuVi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = 0;
        double result = 0;

        System.out.println("Day la chuong trinh tinh dien tich va chu vi hinh tron");

        System.out.println();

        System.out.println("Bam 1 de tinh dien tich");
        System.out.println("Bam 2 de tinh chu vi");
        int luaChon = scanner.nextInt();

        if (luaChon == 1) {
            System.out.println("Moi ban nhap vao ban kinh");
            radius = scanner.nextInt();
            result = Math.PI * radius * radius;
            System.out.println("Dien tich hinh tron la: " + result);
        } else if (luaChon == 2) {
            System.out.println("Moi ban nhap vao ban kinh");
            radius = scanner.nextInt();
            result = Math.PI * radius * 2;
            System.out.println("Chu vi hinh tron la: " + result);
        } else {
            System.out.println("Lua chon khong hop le");
        }

    }
}
