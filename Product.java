import java.util.Scanner;

public class Product {
    private String maSp;
    private String tenSp;

    private double donGia;
    private int soLuong;

    private float giamGia;

    public Product() {
        this.maSp = "";
        this.tenSp = "";
        this.donGia = 0;
        this.soLuong = 0;
        this.giamGia = 0;
    }

    public Product(String maSp, String tenSp, double donGia, int soLuong, float giamGia) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.giamGia = giamGia;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(float giamGia) {
        this.giamGia = giamGia;
    }

    public double getTienChuaKhuyenMai() {
        return this.donGia * soLuong;
    }

    public double getTienSauKhuyenMai() {
        return getTienChuaKhuyenMai() * (1 - giamGia / 100);
    }

    public void input(Scanner scanner) {
        System.out.println("Nhap ma san pham: ");
        this.maSp = scanner.nextLine();
        System.out.println("Nhap ten san pham: ");
        this.tenSp = scanner.nextLine();
        System.out.println("Nhap don gia: ");
        this.donGia = scanner.nextDouble();
        System.out.println("Nhap so luong: ");
        this.soLuong = scanner.nextInt();
        System.out.println("Nhap giam gia: ");
        this.giamGia = scanner.nextFloat();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Product{" +
                "maSp='" + maSp + '\'' +
                ", tenSp='" + tenSp + '\'' +
                ", donGia=" + donGia +
                ", soLuong=" + soLuong +
                ", giamGia=" + giamGia +
                '}';
    }

//    public static void main(String[] args) {
//        Product[] products = new Product[5];
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < products.length; i++) {
//            System.out.println("Nhap thong tin san pham thu " + (i + 1));
//            products[i] = new Product(");
//            products[i].input(scanner);
//        }
//    }
}