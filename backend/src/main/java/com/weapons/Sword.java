package com.weapons;

import com.damage.Slash;

public class Sword extends Blade {
	
	public Sword() {
		this.type = "Sword";
		this.setDamage( new Slash() );
		
	}
}
