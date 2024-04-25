package com.characteristics;

public class Constitution {

	private int physique;
	private int toughness;
	private int health;
	private int resistanceToPoison;
	private int resistanceToDisease;
	
	public Constitution( int multiplier ){
		this.setHealth( 3 * multiplier );
		this.setPhysique( 2 * multiplier );
		this.setResistanceToDisease( 5 * multiplier );
		this.setResistanceToPoison( 5 * multiplier );
		this.setToughness( 3 * multiplier );
	}

	public int getPhysique() {
		return physique;
	}

	public void setPhysique(int physique) {
		this.physique = physique;
	}

	public int getToughness() {
		return toughness;
	}

	public void setToughness(int toughness) {
		this.toughness = toughness;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getResistanceToPoison() {
		return resistanceToPoison;
	}

	public void setResistanceToPoison(int resistanceToPoison) {
		this.resistanceToPoison = resistanceToPoison;
	}

	public int getResistanceToDisease() {
		return resistanceToDisease;
	}

	public void setResistanceToDisease(int resistanceToDisease) {
		this.resistanceToDisease = resistanceToDisease;
	}
	
	
}


