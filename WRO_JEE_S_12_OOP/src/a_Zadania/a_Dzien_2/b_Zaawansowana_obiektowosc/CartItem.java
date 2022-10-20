package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

    public class CartItem {
        private Product product;
        private int quantity;

        public CartItem(Product product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }


    public int getQuantity() {
        return this.quantity;
    }

        public Product getProduct() {
            return this.product;
        }
    }
