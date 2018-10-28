package com.training.epam.Prj01.entity;

public class Lamp extends PartOfTheBuilding{

	private int power;
	
	public Lamp() {
		super();
	}

	public Lamp(String name, int power) {
		super();
		this.power = power;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Lamp power=" + power ;
	}
	
}
