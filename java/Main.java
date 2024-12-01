import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DanhSachKhachHang ds = new DanhSachKhachHang();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== QUAN LY KHACH HANG ===");
            System.out.println("1. Xem danh sach khach hang");
            System.out.println("2. Them khach hang");
            System.out.println("3. Xoa khach hang");
            System.out.println("4. Sua thong tin khach hang");
            System.out.println("5. Tim kiem khach hang");
            System.out.println("6. Thoat");
            System.out.print("Nhap lua chon cua ban: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    ds.hienThiDanhSach();
                    break;
                case 2:
                    ds.themKhachHang();
                    break;
                case 3:
                    System.out.print("Nhap ma so khach hang can xoa: ");
                    String maXoa = sc.nextLine();
                    ds.xoaKhachHang(maXoa);
                    break;
                case 4:
                    System.out.print("Nhap ma so khach hang can sua: ");
                    String maSua = sc.nextLine();
                    ds.suaKhachHang(maSua);
                    break;
                case 5:
                    System.out.print("Nhap ma so khach hang can tim: ");
                    String maTim = sc.nextLine();
                    ds.timKiemKhachHang(maTim);
                    break;
                case 6:
                    System.out.println("Thoat");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 8);

        sc.close();
    }
}
