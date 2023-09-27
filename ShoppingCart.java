/**
 * 買い物かご
 */
public class ShoppingCart {
    private final List<Product> products;

    ShoppingCart() {
        products = new ArrayList<Product>();
    }

    private ShoppingCart(List<Product> products) {
        this.products = products;
    }

    /**
     * 買い物かごに商品を追加する
     * @param product 商品
     * @return 商品が追加された買い物かご
     */
    ShoppingCart add(final Product product) {
        final List<Product> products = new ArrayList<>(products);
        adding.add(product);
        return new ShoppingCart(adding);
    }

    /**
     * @return 商品の合計金額
     */
    int totalPrice() {
        int amount = 0;
        for (Product each : products) {
            amount += each.price;
        }
        return amount;
    }
}
