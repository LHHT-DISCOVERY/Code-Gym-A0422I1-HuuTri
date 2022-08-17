package ss11_java_collection_famework.exercise.ProductArrayList;

public class Product implements Comparable<Product> {
    private String nameProduct;
    private int idProduct;
    private double priceProduct;

    public Product() {
    }

    public Product(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Product(String nameProduct, int idProduct, double priceProduct) {
        this.nameProduct = nameProduct;
        this.idProduct = idProduct;
        this.priceProduct = priceProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return "Product - " +
                "Name Product : " + nameProduct +
                " || idProduct : " + idProduct +
                " || priceProduct : " + priceProduct + "$";
    }


    public int compareTo(Product o) {
       return  this.nameProduct.compareTo(o.getNameProduct());
    }
}
