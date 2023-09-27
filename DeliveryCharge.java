class DeliveryCharge {
    private static final int CHARGE_FREE_THERESHOLD = 2000;
    private static final int PAY_CHARGE = 500;
    private static final int CHARGE_FREE = 0;
    final int amount;

    DeliveryCharge(final ShoppingCart shoppingCart) {
        amount = (shoppingCart.totalPrice() < CHARGE_FREE_THERESHOLD) ? PAY_CHARGE : CHARGE_FREE;
    }
}