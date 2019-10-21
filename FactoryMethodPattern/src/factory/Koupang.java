package factory;


public class Koupang extends ShoppingMall{

	@Override
	Shopping selectCategory(String category) {
		
		System.out.println("-----------Koupang-----------");
		
		if (category.equals("food")) {
		       return new TimonFoodCategory();
	        } else if (category.equals("health")) {
	           return new TimonHealthCategory();
	        }
		       return null;
	}
}
