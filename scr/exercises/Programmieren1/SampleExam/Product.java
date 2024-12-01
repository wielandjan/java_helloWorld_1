package exercises.Programmieren1.SampleExam;

public enum Product {
    LAPTOP(999.75),
    SMARTPHONE(499.99),
    TABLET(745.45);

    private final double price;

    Product(double price) {
        this.price = price;
    }

    public static Product isAvailible(String productName) {
        for (Product product : Product.values()) {
            if (product.toString().equals(productName)) {
                return product;
            }
        }
        return null;
    }

    public double getPrice() {
        return price;
    }
}
