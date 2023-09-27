class DeliveryCharge {
    final int amount;

    DeliveryCharge(final ShoppingCart shoppingCart) {
        amount = DeliveryMangager.deliveryCharge(shoppingCart.products);
    }
}