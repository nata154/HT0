package com.training.epam.Prj01;

import java.util.ArrayList;
import java.util.List;

import com.training.epam.Prj01.entity.Furniture;
import com.training.epam.Prj01.entity.Lamp;
import com.training.epam.Prj01.entity.Room;
import com.training.epam.Prj01.entity.RoomMaker;
import com.training.epam.Prj01.exception.IlluminanceTooMuchException;
import com.training.epam.Prj01.exception.SpaceUsageTooMuchException;

public class MainApp {

	public static void main(String[] args) throws IlluminanceTooMuchException {

		// List<PartOfTheBuilding> roomMaker1;
		List<RoomMaker> building = new ArrayList<RoomMaker>();

		RoomMaker roomMaker1 = new RoomMaker();
		Room room1 = new Room("Room 1", 100, 3);
		Lamp lamp1_1 = new Lamp("Lamp 1", 400);
		Lamp lamp2_1 = new Lamp("Lamp 2", 800);
		Furniture furniture1_1 = new Furniture("Sofa", 60);
		Furniture furniture2_1 = new Furniture("Wardrobe", 30);

			roomMaker1.addPart(room1);
			roomMaker1.addPart(lamp1_1);
			roomMaker1.addPart(lamp2_1);
			roomMaker1.addPart(furniture1_1);
			roomMaker1.addPart(furniture2_1);
			building.add(roomMaker1);
			roomMaker1.describe();
			
			try {
				roomMaker1.checkIlluminance(roomMaker1);
		} catch (IlluminanceTooMuchException ex) {
			ex.printStackTrace();
		}
			
			try {
				roomMaker1.checkSpaceUsage(roomMaker1);
		} catch (SpaceUsageTooMuchException ex) {
			ex.printStackTrace();
		}
		
System.out.println();

		RoomMaker roomMaker2 = new RoomMaker();
		Room room2 = new Room("Room 2", 1000, 0);
		Lamp lamp1_2 = new Lamp("Lamp 1", 4);
		Lamp lamp2_2 = new Lamp("Lamp 2", 8);
		Lamp lamp2_3 = new Lamp("Lamp 2", 8);
		Furniture furniture1_2 = new Furniture("Sofa", 200);
		Furniture furniture2_2 = new Furniture("Wardrobe", 300);

			roomMaker2.addPart(room2);
			roomMaker2.addPart(lamp1_2);
			roomMaker2.addPart(lamp2_2);
			roomMaker2.addPart(lamp2_3);
			roomMaker2.addPart(furniture1_2);
			roomMaker2.addPart(furniture2_2);
			building.add(roomMaker2);
			roomMaker2.describe();
		
		try {
			roomMaker2.checkIlluminance(roomMaker2);
	} catch (IlluminanceTooMuchException ex) {
		ex.printStackTrace();
	}

		// Don't work, WHY?
//		((RoomMaker) building).describe();

		System.out.println();
		for (RoomMaker p : building) {
			System.out.println(p);
		}

	}

}
