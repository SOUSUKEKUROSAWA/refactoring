class DeliveryCharge {
    private static final int CHARGE_FREE_THERESHOLD = 2000;
    private static final int PAY_CHARGE = 500;
    private static final int CHARGE_FREE = 0;
    final int amount;

    DeliveryCharge(final ShoppingCart shoppingCart) {
        if (shoppingCart.totalPrice() < CHARGE_FREE_THERESHOLD) {
            amount = PAY_CHARGE;
        }
        else {
            amount = CHARGE_FREE;
        }
    }
}