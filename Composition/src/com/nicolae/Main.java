package com.nicolae;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B","Dell","240",dimensions);

        Monitor theMonitor = new Monitor("27inch Beast","Acer",27, new Resolution(2540,1440));

        MotherBoard theMotherBoard = new MotherBoard("Bj-200","Assus",4,6,"v2.44");

        PC thePC = new PC(theCase,theMonitor,theMotherBoard);
        thePC.powerUp();

        System.out.println(" ");

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12,55);

        Bed bed = new Bed("Classic",6,3,2,1);

        Lamp lamp = new Lamp("Classic", false, 99);

        Bedroom bedRoom = new Bedroom("Nicolae",wall1,wall2,wall3,wall4, ceiling,bed,lamp);

        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();

    }

}
