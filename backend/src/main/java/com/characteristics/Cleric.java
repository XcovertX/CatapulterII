package com.characteristics;

import com.calculator.D8;

public class Cleric extends ActorClass {

	public Cleric() {
		this.setHitDie( new D8() );
	}
}
