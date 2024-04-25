package com.weapons;

import com.objects.Thing;

public abstract class Ammunition extends Thing {
	
	private String ammoType;

	public String getAmmoType() {
		return ammoType;
	}

	public void setAmmoType(String ammoType) {
		this.ammoType = ammoType;
	}

}
