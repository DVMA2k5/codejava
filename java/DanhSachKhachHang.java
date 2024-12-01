import java.io.*;
import java.util.ArrayList;


class DanhSachKhachHang {
    private ArrayList<KhachHang> danhSach;

    public DanhSachKhachHang() {
        danhSach = new ArrayList<>();
    }

    // Thêm khách hàng
    public void themKhachHang() {
        KhachHang kh = new KhachHang();
        kh.nhapThongTin();
        danhSach.add(kh);
        ghiFile("C:\\project\\java\\text");
        System.out.println("Them khach hang thanh cong!");
    }

    // Hiển thị danh sách khách hàng
    public void hienThiDanhSach() {
        docFile("C:\\project\\java\\text");
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach khach hang trong!");
        } else {
            System.out.println("\n=== DANH SACH KHACH HANG ===");
            for (int i = 0; i < danhSach.size(); i++) {
                System.out.println("\nKhach hang thu " + (i + 1) + ":");
                danhSach.get(i).hienThiThongTin();
            }
        }
    }

    // Tìm kiếm khách hàng theo mã số
    public void timKiemKhachHang(String maSo) {
        docFile("C:\\project\\java\\text");
        for (KhachHang kh : danhSach) {
            if (kh.getMaSo().equals(maSo)) {
                System.out.println("\nTim thay khach hang:");
                kh.hienThiThongTin();
                return;
            }
        }
        System.out.println("Khong tim thay khach hang voi ma so " + maSo);
    }

    // Xóa khách hàng theo mã số
    public void xoaKhachHang(String maSo) {
        docFile("C:\\project\\java\\text");
        for (KhachHang kh : danhSach) {
            if (kh.getMaSo().equals(maSo)) {
                danhSach.remove(kh);
                ghiFile("C:\\project\\java\\text");
                System.out.println("Xoa khach hang thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay khach hang voi ma so " + maSo);
    }

    // Cập nhật thông tin khách hàng theo mã số
    public void suaKhachHang(String maSo) {
        docFile("C:\\project\\java\\text");
        for (KhachHang kh : danhSach) {
            if (kh.getMaSo().equals(maSo)) {
                System.out.println("Nhap thong tin moi:");
                kh.nhapThongTin();
                ghiFile("C:\\project\\java\\text");
                System.out.println("Cap nhat thong tin thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay khach hang voi ma so " + maSo);
    }

    // Ghi danh sách khách hàng vào file
    public void ghiFile(String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\project\\java\\text"))) {
            for (KhachHang kh : danhSach) {
                String line = String.format("%s, %s, %s", kh.getMaSo(), kh.getTen(), kh.getSoDienThoai());
                bw.write(line);
                bw.newLine();
            }
            
        } catch (IOException e) {
            System.out.println("Loi khi ghi file: " + e.getMessage());
        }
    }

    // Đọc danh sách khách hàng từ file
    public void docFile(String fileName) {
        danhSach.clear();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\project\\java\\text"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String maSo = parts[0].trim();
                    String ten = parts[1].trim();
                    String soDienThoai = parts[2].trim();
                    KhachHang kh = new KhachHang(maSo, ten, soDienThoai);
                    danhSach.add(kh);
                }
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("File khong ton tai!");
        } catch (IOException e) {
            System.out.println("Loi khi doc file: " + e.getMessage());
        }
    }
}
