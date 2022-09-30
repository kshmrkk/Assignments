package Shopping;

public class CartEntry {
    String Category;
    String product;
    int quantity;
    int price;

    public CartEntry(String Category, String product, int quantity, int price) {
        super();
        this.Category = Category;
        this.product=product;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Cart Entry:\n[Category="+ Category+",Name="+product+",Quantity="+ quantity+",Price="+price+"]";
    }
    public int getQuantity(){
        return quantity;
    }
    public void increaseQuantity(){
        this.quantity++;
    }
    public void decreaseQuantity(){
        if(this.quantity>0){
            this.quantity--;
        }
    }
    public String getCategory() {
        return Category;
    }
    public void setCategory(String category) {
        Category = category;
    }
    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
        this.product = product;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setId(int id){
        this.Category = Category;
    }
}
