package factory;


public class Koupang extends ShoppingMall{

	@Override
	Shopping selectCategory(String category) {
		
		System.out.println("-----------Koupang-----------");
		
		if (category.equals("Food")) {
		       return new KoupangFoodCategory();
	        } else if (category.equals("Health")) {
	           return new KoupangHealthCategory();
	        }
		       return null;
	}
}
