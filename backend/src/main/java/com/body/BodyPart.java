package com.body;

import com.objects.Thing;

public abstract class BodyPart extends Thing {

	private Thing onItem;			// item currently being worn on body part
	private Thing inItem;			// item currently being worn in body part
	private String wearableType;	// identifies types body part can wear
	private boolean canWearOn;		// body part has ability to don item on
	private boolean canWearIn;		// body part has ability to don item in
	private String partIdentifier;
	
	private String color;
	
	public BodyPart() {
		
	}

	public Thing getOnItem() {
		return onItem;
	}

	public void wearItemOn(Thing onItem) {
		this.onItem = onItem;
	}

	public Thing getInItem() {
		return inItem;
	}

	public void wearItemIn(Thing inItem) {
		this.inItem = inItem;
	}

	public String getWearableType() {
		return wearableType;
	}

	public void setWearableType(String wearableType) {
		this.wearableType = wearableType;
	}

	public boolean canWearOn() {
		return canWearOn;
	}

	public void setCanWearOn(boolean canWearOn) {
		this.canWearOn = canWearOn;
	}

	public boolean canWearIn() {
		return canWearIn;
	}

	public void setCanWearIn(boolean canWearIn) {
		this.canWearIn = canWearIn;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPartIdentifier() {
		return partIdentifier;
	}

	public void setPartIdentifier(String partIdentifier) {
		this.partIdentifier = partIdentifier;
	}

}
