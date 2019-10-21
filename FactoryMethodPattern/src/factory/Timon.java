package factory;


public class Timon extends ShoppingMall{

	@Override
	Shopping selectCategory(String category) {
		
		System.out.println("-----------Timon-----------");
		
		if (category.equals("Food")) {
	       return new TimonFoodCategory();
        } else if (category.equals("Health")) {
           return new TimonHealthCategory();
        }
	       return null;
	}
}
