package com.org;

public class LawnMowerOffCommand implements Command {
	LawnMower lawnmower;
	int prevSpeed;
  
	public LawnMowerOffCommand(LawnMower lawnmower) {
		this.lawnmower = lawnmower;
	}
 
	public void execute() {
		prevSpeed = lawnmower.getSpeed();
		lawnmower.off();
	}
 
	public void undo() {
		if (prevSpeed == LawnMower.HIGH) {
			lawnmower.high();
		} else if (prevSpeed == LawnMower.MEDIUM) {
			lawnmower.medium();
		} else if (prevSpeed == LawnMower.LOW) {
			lawnmower.low();
		} else if (prevSpeed == LawnMower.OFF) {
			lawnmower.off();
		}
	}
}
