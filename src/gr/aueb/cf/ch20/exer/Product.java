package gr.aueb.cf.ch20.exer;

public class Product {
    private int productId;
    private String title;
    private int price;
    private int quantity;

    public Product() {
    }

    public Product(int productId, String title, int price, int quantity) {
        this.productId = productId;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public void printInstanceProduct() {
        System.out.println("ID: " + productId + ", Title: " + title + ", Price: " + price + ", Quantity: " + quantity);
    }

    public static void printStaticProduct(Product product) {
        System.out.println("ID: " + product.getProductId() + ", Title: " + product.getTitle()
                + ", Price: " + product.getPrice() + ", Quantity: " + product.getQuantity());
    }
}
