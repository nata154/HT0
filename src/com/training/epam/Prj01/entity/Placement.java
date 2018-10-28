package com.training.epam.Prj01.entity;

public class Placement extends PartOfTheBuilding {

	private int squarePlacement;
	private int windows;
	
	public Placement() {
		super();
	}

	public Placement(String name, int squarePlacement, int windows) {
		super();
		this.squarePlacement = squarePlacement;
		this.windows = windows;
	}

	public int getSquare() {
		return squarePlacement;
	}

	public void setSquare(int square) {
		this.squarePlacement = square;
	}

	public int getWindows() {
		return windows;
	}

	public void setWindows(int windows) {
		this.windows = windows;
	}

	@Override
	public String toString() {
		return "Placement [squarePlacement=" + squarePlacement + "m2 , windows= " + windows + "]";
	}



}
