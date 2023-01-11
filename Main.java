import java.util.Scanner;

public class Main {

    public Main() {
    }

    public double getTotalAfterSale(Product[] products) {
        double totalAfterSale = 0;
        for (Product item : products) {
            totalAfterSale += item.getTienSauKhuyenMai();
        }
        return Math.round(totalAfterSale);
    }

    public double getTotalBeforeSale(Product[] products) {
        double totalBeforeSale = 0;
        for (Product item : products) {
            totalBeforeSale += item.getTienChuaKhuyenMai();
        }
        return Math.round(totalBeforeSale);
    }

    public double cl(Product[] products) {
        return Math.abs(Math.round(this.getTotalAfterSale(products) - this.getTotalBeforeSale(products)));
    }

    public static void main(String[] args) {

        Product[] products = new Product[5];
        Scanner scanner = new Scanner(System.in);
        products[0] = new Product("1", "product 1", 1000, 10, 1);
        products[1] = new Product("2", "product 2", 2000, 4, 4);
        products[2] = new Product("3", "product 3", 3000, 10, 2);
        products[3] = new Product("4", "product 4", 5000, 10, 5);
        products[4] = new Product("5", "product 5", 4000, 10, 2);


        System.out.println("Danh sach san pham: ");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].toString());
        }

        Main main = new Main();

        // Tinh tong tien cac san pham sau khuyen mai
        System.out.println("Tong tien cac san pham sau khuyen mai: " + main.getTotalAfterSale(products));

//        // Tinh tong tien chenh lenh khi co khuyen mai
        System.out.println("Tong tien chua co khuyen mai: " + main.getTotalBeforeSale(products));
//
        System.out.println("Tong tien chenh lenh: " + main.cl(products));
    }
}
