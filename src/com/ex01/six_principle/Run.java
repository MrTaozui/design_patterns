package com.ex01.six_principle;

import java.util.HashMap;
import java.util.Map;

public class Run {
	
	public static void main(String[] args) {
		HashMap map = new HashMap<>(); //传的参数是正确的
		Son s = new Son();
		s.setValue(map);//多态 导致的结果
		Father f = new Father();
		f.setValue(map);
		System.out.println(3.05+3.73+4.63+3.50-1.66+0.14+2.06+10+3.44+4.5);
	}

}
