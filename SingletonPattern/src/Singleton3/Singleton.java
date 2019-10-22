package Singleton3;

public class Singleton {
	private Singleton() {}
	
	public static Singleton getInstance() {
		return LazyHolder.single;
	}
	
	private static class LazyHolder{
		private static final Singleton single = new Singleton();
	}
	
}
