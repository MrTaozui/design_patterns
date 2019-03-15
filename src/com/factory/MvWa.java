package com.factory;

public class MvWa {
	public static void main(String[] args) {
		AbstractHumanFactory factory=new HumanFactory();
		WhiteMan whiteMan=factory.createHuman(WhiteMan.class);
		whiteMan.getColor();
		whiteMan.talk();
		BlackMan blackMan=factory.createHuman(BlackMan.class);
		blackMan.getColor();
		blackMan.talk();
	}
	

}
