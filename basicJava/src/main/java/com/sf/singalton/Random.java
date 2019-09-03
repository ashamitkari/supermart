package com.sf.singalton;

public class Random {
    private static Random instance= null;
     private Random random= null;
    
    public static Random getInstance() {
    	 instance=  new Random();
		return instance;
    	
    }
	
}
