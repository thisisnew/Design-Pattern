package factory;


public class Timon extends ShoppingMall{

	@Override
	Shopping selectCategory(String category) {
		
		System.out.println("-----------Timon-----------");
		
		if (category.equals("food")) {
	       return new TimonFoodCategory();
        } else if (category.equals("health")) {
           return new TimonHealthCategory();
        }
	       return null;
	}
}
