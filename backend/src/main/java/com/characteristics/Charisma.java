 package com.characteristics;

public class Charisma {
	
	private int attractiveness;
	private int persuasiveness;
	private int magnetism;
	
	public Charisma() {
		this.setAttractiveness( 1 );
		this.setPersuasiveness( 1 );
		this.setMagnetism( 1 );
	}

	public int getAttractiveness() {
		return attractiveness;
	}

	public void setAttractiveness( int attractiveness ) {
		this.attractiveness = attractiveness;
	}

	public int getMagnetism() {
		return magnetism;
	}

	public void setMagnetism( int magnetism ) {
		this.magnetism = magnetism;
	}

	public int getPersuasiveness() {
		return persuasiveness;
	}

	public void setPersuasiveness( int persuasiveness ) {
		this.persuasiveness = persuasiveness;
	};
	
	

}
