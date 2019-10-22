package Singleton;

import Singleton.Singleton;

public class Main {
	public static void main(String[] args) {
	    
	    for(int i=0; i<3; i++) {
	    	Singleton singleton = Singleton.getInstance();
	    	System.out.println("singleton  : " + singleton.toString());	
	    }
	    
	    for(int i=0; i<3; i++) {
	    	Instance instance = new Instance();
	    	instance.getInstance();
	    	System.out.println("instance  : " + instance.toString());	
	    }
	}
}
