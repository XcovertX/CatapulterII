package com.characteristics;

public class Dexterity {

	private int handEyeCoordination;
	private int agility;
	private int fineMotor;
	private int reflexes;
	private int speedOfMovement;
	private int balance;
	private int accuracy;
	
	public Dexterity( int multiplier ) {
		this.setAccuracy( 3 * multiplier );
		this.setAgility( 3 * multiplier );
		this.setBalance( 2 * multiplier );
		this.setFineMotor( 2 * multiplier );
		this.setHandEyeCoordination( 3 * multiplier );
		this.setReflexes( 3 * multiplier );
		this.setSpeedOfMovement( 3 * multiplier );
	}

	public int getHandEyeCoordination() {
		return handEyeCoordination;
	}

	public void setHandEyeCoordination(int handEyeCoordination) {
		this.handEyeCoordination = handEyeCoordination;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getFineMotor() {
		return fineMotor;
	}

	public void setFineMotor(int fineMotor) {
		this.fineMotor = fineMotor;
	}

	public int getSpeedOfMovement() {
		return speedOfMovement;
	}

	public void setSpeedOfMovement(int speedOfMovement) {
		this.speedOfMovement = speedOfMovement;
	}

	public int getReflexes() {
		return reflexes;
	}

	public void setReflexes(int reflexes) {
		this.reflexes = reflexes;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	
	
}
