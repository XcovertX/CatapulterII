package com.characteristics;

import java.util.LinkedList;

public abstract class ActorRace {
	
	private LinkedList< StatModifier > raceModifiers;
	private String averageSize;
	
	private int strengthBenefit;
	private int dexterityBenefit;
	private int constitutionBenefit;
	private int intelligenceBenefit;
	private int wisdomBenefit;
	private int charismaBenefit;
	private int luckBenefit;
	
	public int getStrengthBenefit() {
		return strengthBenefit;
	}

	public void setStrengthBenefit( int strengthBenefit ) {
		this.strengthBenefit = strengthBenefit;
	}

	public int getDexterityBenefit() {
		return dexterityBenefit;
	}

	public void setDexterityBenefit( int dexterityBenefit ) {
		this.dexterityBenefit = dexterityBenefit;
	}

	public int getConstitutionBenefit() {
		return constitutionBenefit;
	}

	public void setConstitutionBenefit( int constitutionBenefit ) {
		this.constitutionBenefit = constitutionBenefit;
	}

	public int getIntelligenceBenefit() {
		return intelligenceBenefit;
	}

	public void setIntelligenceBenefit( int intelligenceBenefit ) {
		this.intelligenceBenefit = intelligenceBenefit;
	}

	public int getWisdomBenefit() {
		return wisdomBenefit;
	}

	public void setWisdomBenefit( int wisdomBenefit ) {
		this.wisdomBenefit = wisdomBenefit;
	}

	public int getCharismaBenefit() {
		return charismaBenefit;
	}

	public void setCharismaBenefit( int charismaBenefit ) {
		this.charismaBenefit = charismaBenefit;
	}

	public int getLuckBenefit() {
		return luckBenefit;
	}

	public void setLuckBenefit( int luckBenefit ) {
		this.luckBenefit = luckBenefit;
	}

	public LinkedList< StatModifier > getRaceModifiers() {
		return raceModifiers;
	}

	public void setRaceModifiers(LinkedList< StatModifier > raceModifiers) {
		this.raceModifiers = raceModifiers;
	}

	public String getAverageSize() {
		return averageSize;
	}

	public void setAverageSize(String averageSize) {
		this.averageSize = averageSize;
	}

}
