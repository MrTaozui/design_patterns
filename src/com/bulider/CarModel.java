package com.bulider;

import java.util.ArrayList;

public abstract class CarModel {
	private ArrayList<String> squence=new ArrayList<>();
	
	protected abstract void start();
	
	protected abstract void alarm();
	
	protected abstract void stop();

}
