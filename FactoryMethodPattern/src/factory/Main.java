package factory;


public class Main {
	public static void main(String[] args) {
		
		//Timon 주문 시작
		ShoppingMall timon = new Timon();
		
		Shopping vitamin = timon.shopping("health");
		Shopping chickenBreast = timon.shopping("health");
		
		
		//Koupang 주문 시작
		ShoppingMall koupang = new Koupang();
		
		Shopping roastedEgg = koupang.shopping("food");
		Shopping protein = koupang.shopping("health");
	}
}	
