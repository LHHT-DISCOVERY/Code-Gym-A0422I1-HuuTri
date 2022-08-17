package ss11_java_collection_famework.exercise.ProductArrayList;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager listProduct = new ProductManager();
        int select = 0;
        do {
            System.out.println("--- MENU ---");
            System.out.println("1.\tThêm sản phẩm\n" +
                    "2.\tTìm kiếm tên sản phẩm theo ID\n" +
                    "3.\tXóa sản phẩm \n" +
                    "4.\tHiển thị danh sách sản phẩm\n" +
                    "5.\tChỉnh sửa tên sản phẩm \n" +
                    "6.\tSắp xếp sản phẩm theo giá giảm dần\n" +
                    "0.\tThoát chương trình \n");
            System.out.println("Nhập lựa chọn của bạn : ");
            select = scanner.nextInt();
            scanner.nextLine();
            switch (select) {
                case 1:
                    System.out.println("Nhập ID");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Mời bạn nhập tên sản phẩm : ");
                    String name = scanner.nextLine();
                    System.out.println(" Nhập giá : ");
                    double price = scanner.nextDouble();
                    Product product = new Product(name, id, price);
                    listProduct.addProduct(product);
                    System.out.println("Nhập thành công");
                    break;
                case 2:
                    System.out.println("Nhập tên sản phẩm cần tìm kiếm : ");
                    id = scanner.nextInt();
                    listProduct.search(id);
                    break;
                case 3:
                    System.out.println("Nhập tên sản phẩm cần xóa : ");
                    name = scanner.nextLine();
                    product = new Product(name);
                    listProduct.remove(product);
                    break;
                case 4:
                    listProduct.show();
                    break;
                case 5:
                    System.out.println("Nhập tên sản phẩm bạn muốn chỉnh sửa : ");
                    String nameProduct = scanner.nextLine();
                    if (listProduct.checkNameProduct(nameProduct)) {
                        System.out.println("Bạn muốn chuyển đổi thành : ");
                        String newName = scanner.nextLine();
                        listProduct.editProduct(nameProduct, newName);
                    } else {
                        System.out.println("Không có sản phẩm này ");
                    }
                    break;
                case 6:
                    System.out.println("Xắp xếp sản phẩm theo giá từ cao đến thấp");
                    listProduct.sortPrice();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("NOT select in MENU");
            }
        } while (select != 0);
    }
}
