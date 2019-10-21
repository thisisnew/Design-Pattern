package factory;


public class KoupangFoodCategory implements Shopping{

	@Override
	public void find() {
		System.out.println("구운 달걀을 검색합니다.");
		
	}

	@Override
	public void cart() {
		System.out.println("참나무로 구운(...) 달걀을 카트에 담습니다.");
		
	}

	@Override
	public void order() {
		System.out.println("달걀을 주문합니다.");
		
	}

	@Override
	public void check() {
		System.out.println("달걀 주문이 올바르게 되었는지 확인합니다.");
		
	}
}
