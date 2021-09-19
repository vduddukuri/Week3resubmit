package com.org;

public class LawnMowerLowCommand implements Command {
	LawnMower lawnmower;
	int prevSpeed;
  
	public LawnMowerLowCommand(LawnMower lawnmower) {
		this.lawnmower = lawnmower;
	}
 
	public void execute() {
		prevSpeed = lawnmower.getSpeed();
		lawnmower.low();
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
