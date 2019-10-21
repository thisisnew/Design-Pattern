package factory;


public abstract class ShoppingMall {
	
	public Shopping shopping(String category) {
        Shopping shopping = selectCategory(category);    // factory method 사용
        shopping.find();
        shopping.cart();
        shopping.order();
        shopping.check();
        return shopping;
    }

    // factory method
    abstract Shopping selectCategory(String category);
}
