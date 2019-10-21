package factory;


public class Main {
	public static void main(String[] args) {
		
		//Timon 주문 시작
		ShoppingMall timon = new Timon();
		
		Shopping vitamin = timon.shopping("Health");
		Shopping chickenBreast = timon.shopping("Food");
		
		
		//Koupang 주문 시작
		ShoppingMall koupang = new Koupang();
		
		Shopping protein = koupang.shopping("Health");
		Shopping roastedEgg = koupang.shopping("Food");
	}
}	
