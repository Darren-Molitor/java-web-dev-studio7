package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd1 = new CD("Satriani", 200.0, 250.0, "mp3", 15);
        CD cd2 = new CD("KISS", 350.0, 250.0, "mp4", 12);
        DVD dvd1 = new DVD("SlapShot", 300.0, 350.0, "redray");
        DVD dvd2 = new DVD("Caligula", 450.0, 500.0, "bluray");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.println(cd1.getName() + " " + cd1.getAudioType());
        cd1.spinDisc();

        System.out.println(cd2.getName() + " " + cd2.getAudioType());
        cd2.spinDisc();

        System.out.println(dvd1.getName() + " " + dvd1.getVideoType());
        dvd1.spinDisc();

        System.out.println(dvd2.getName() + " " + dvd2.getVideoType());
        dvd2.spinDisc();

    }
}
