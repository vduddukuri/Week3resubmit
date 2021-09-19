package com.org;

public class LawnMowerHighCommand implements Command {
	LawnMower lawnmower;
	int prevSpeed;
  
	public LawnMowerHighCommand(LawnMower lawnmower) {
		this.lawnmower = lawnmower;
	}
 
	public void execute() {
		prevSpeed = lawnmower.getSpeed();
		lawnmower.high();
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
