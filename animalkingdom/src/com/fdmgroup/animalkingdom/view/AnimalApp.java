package com.fdmgroup.animalkingdom.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//import java.nio.channels.NonWritableChannelException;

import com.fdmgroup.animalkingdom.controller.LionController;
import com.fdmgroup.animalkingdom.controller.LionControllerImpl;
import com.fdmgroup.animalkingdom.model.Lion;

public class AnimalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LionController lion = new lion;

		LionController lionControl = new LionControllerImpl();
		
		AnimalApp ap = new AnimalApp();
		// now add lions and then update on GIT
		// lionControl.addLion(NonWritableChannelException );

		ap.addLion(lionControl);
		
		List<Lion> lionList = lionControl.getAllLions();
		Iterator<Lion> lionListIterator = lionList.iterator();
		ap.displayLion(lionControl, lionListIterator);
	}

	public void displayLion(LionController lionControl, Iterator<Lion> lionListIterator) {
		Lion singleLion = lionControl.getSingleLion(1);
		System.out.println(lionControl.getAllLions().size());
		System.out.println(singleLion);
		System.out.println(singleLion.getCountry() + " Yeh yEhA Miltey Hai: ");

		while (lionListIterator.hasNext()) {
			Lion tempLion = lionListIterator.next();
			System.out.print("the other name: " + tempLion.getOthername());
			System.out.println();
		}
	}

	public void addLion(LionController lionControl) {
		lionControl.addLion(new Lion(3.2, 123, "India", 5, 15987, "Sher"));
		lionControl.addLion(new Lion(2.89, 125, "Africa", 7, 10798, "Sheru"));
		lionControl.addLion(new Lion(3.00, 160, "Gujarat", 4, 1098, "GujratiSher"));
	}

}
