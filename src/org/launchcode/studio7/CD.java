package org.launchcode.studio7;

// TODO: Implement your custom interface.
// TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
//  need to be declared separately.
public class CD extends BaseDisc implements OpticalDisc {
    public String audioType;   // mp3, mp4
    public int nbrSongs;   // number or songs

    public CD(String name, Double size, Double spinRate, String audioType, int nbrSongs) {
        super(name, size, spinRate);
        this.audioType = audioType;
        this.nbrSongs = nbrSongs;
    }

    public String getAudioType() {return audioType;}

    public void setAudioType(String audioType) {this.audioType = audioType;}

    @Override
    public void spinDisc() {
        System.out.println(this.getName() + " CD spins at a rate of " + this.getSpinRate());
    }
}
