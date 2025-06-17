public class Product {
    private String name;
    private double price;
    private double rating;

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public double getRating() { return rating; }

    @Override
    public String toString() {
        return name + " - ₹" + price + " - ⭐" + rating;
    }
}
public class FlipkartSortDemo {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Samsung M14", 11999, 4.2));
        products.add(new Product("iPhone 14", 69999, 4.8));
        products.add(new Product("Redmi Note 12", 14999, 4.1));
        products.add(new Product("OnePlus Nord", 28999, 4.5));

        // Sort by Price (Low to High)
        products.sort(Comparator.comparing(Product::getPrice));
        System.out.println("📦 Sorted by Price (Low to High):");
        products.forEach(System.out::println);

        // Sort by Price (High to Low)
        products.sort(Comparator.comparing(Product::getPrice).reversed());
        System.out.println("\n📦 Sorted by Price (High to Low):");
        products.forEach(System.out::println);

        // Sort by Rating (High to Low)
        products.sort(Comparator.comparing(Product::getRating).reversed());
        System.out.println("\n📦 Sorted by Rating (High to Low):");
        products.forEach(System.out::println);
    }
}
