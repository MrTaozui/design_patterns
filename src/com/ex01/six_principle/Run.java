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
	}

}
