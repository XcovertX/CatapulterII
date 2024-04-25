package com.characteristics;

import com.calculator.D10;

public class Fighter extends ActorClass {

	public Fighter() {
		this.setHitDie( new D10() );
	}
}
