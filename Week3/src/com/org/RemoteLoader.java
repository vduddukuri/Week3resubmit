package com.org;

public class RemoteLoader {
 
	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
 

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();

		LawnMower lawnmower = new LawnMower("Back Yard");
   
		LawnMowerMediumCommand lawnmowerMedium = 
				new LawnMowerMediumCommand(lawnmower);
		LawnMowerHighCommand lawnmowerHigh = 
				new LawnMowerHighCommand(lawnmower);
		LawnMowerOffCommand lawnmowerOff = 
				new LawnMowerOffCommand(lawnmower);
  
		remoteControl.setCommand(0, lawnmowerMedium, lawnmowerOff);
		remoteControl.setCommand(1, lawnmowerHigh, lawnmowerOff);
   
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
  
		remoteControl.onButtonWasPushed(1);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
	}
}
