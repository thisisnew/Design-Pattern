package Singleton3;

import Singleton.Singleton;

public class Main {
	public static void main(String[] args) {
	    
		MultiThread AAA = new MultiThread("AAA");
		MultiThread BBB = new MultiThread("BBB"); 
		
		AAA.start();
		BBB.start();
	    
	}
}
