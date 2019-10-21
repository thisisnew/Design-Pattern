package factory;


public class TimonHealthCategory implements Shopping{

	@Override
	public void find() {
		System.out.println("구매하려는 비타민을 검색합니다.");
		
	}

	@Override
	public void cart() {
		System.out.println("마음에 드는 비타민을 카트에 담습니다.");
		
	}

	@Override
	public void order() {
		System.out.println("비타민을 주문합니다.");
		
	}

	@Override
	public void check() {
		System.out.println("비타민 주문이 올바르게 되었는지 확인합니다.");
		
	}
}
