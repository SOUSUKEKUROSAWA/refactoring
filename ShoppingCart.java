/**
 * 買い物かご
 */
public class ShoppingCart {
    final List<Product> products;

    ShoppingCart() {
        products = new ArrayList<Product>();
    }

    private ShoppingCart(List<Product> products) {
        this.products = products;
    }

    ShoppingCart add(final Product product) {
        final List<Product> products = new ArrayList<>(products);
        adding.add(product);
        return new ShoppingCart(adding);
    }
}
