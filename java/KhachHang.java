import java.util.Scanner;

class KhachHang {
    private String maSo;
    private String ten;
    private String soDienThoai;

    // Constructors
    public KhachHang() {}

    public KhachHang(String maSo, String ten, String soDienThoai) {
        this.maSo = maSo;
        this.ten = ten;
        this.soDienThoai = soDienThoai;
    }

    // Getters và Setters
    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    // Nhập thông tin khách hàng
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma so: ");
        this.maSo = sc.nextLine();
        System.out.print("Nhap ten: ");
        this.ten = sc.nextLine();
        System.out.print("Nhap so dien thoai: ");
        this.soDienThoai = sc.nextLine();
    }

    // Hiển thị thông tin khách hàng
    public void hienThiThongTin() {
        System.out.println("Ma so: " + maSo);
        System.out.println("Ten: " + ten);
        System.out.println("So dien thoai: " + soDienThoai);
    }
}
