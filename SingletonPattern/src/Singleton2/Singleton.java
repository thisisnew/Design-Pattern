package Singleton2;

public class Singleton {
	private static volatile Singleton single = null;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		
		if(single == null) {
			synchronized (Singleton.class) {   
				if(single == null) {
					System.out.println("싱글톤 생성...");
					
					single= new Singleton();
				}
			}
		}
		
		return single;
	}
	
}
