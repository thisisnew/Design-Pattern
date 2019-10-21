package factory;


public class TimonFoodCategory implements Shopping{
	
	@Override
	public void find() {
		System.out.println("닭가슴살 브랜드를 검색합니다.");
		
	}

	@Override
	public void cart() {
		System.out.println("마음에 드는 닭가슴살을 카트에 담습니다.");
		
	}

	@Override
	public void order() {
		System.out.println("닭가슴살을 주문합니다.");
		
	}

	@Override
	public void check() {
		System.out.println("닭가슴살 주문이 올바르게 되었는지 확인합니다.");
		
	}
}
