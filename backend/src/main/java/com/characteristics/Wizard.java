package com.characteristics;

import com.calculator.D6;

public class Wizard extends ActorClass {

	public Wizard() {
		this.setHitDie( new D6() ); 
	}
}
