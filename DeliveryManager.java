/**
 * 配送管理クラス
 */
public class DeliveryMangager {
    public static int deliveryCharge(ShoppingCart shoppingCart) {
        int charge = 0;
        if (shoppingCart.totalPrice() < 2000) {
            charge = 500;
        }
        else {
            charge = 0;
        }
        return charge;
    }
}
