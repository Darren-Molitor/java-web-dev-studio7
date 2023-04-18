package org.launchcode.studio7;

// TODO: Implement your custom interface.
// TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
//  need to be declared separately.
public class DVD extends BaseDisc implements OpticalDisc {
    public String videoType;   // dvd or bluray

    public DVD(String name, Double size, Double spinRate, String videoType) {
        super(name, size, spinRate);
        this.videoType = videoType;
    }

    public String getVideoType() {return videoType;}

    public void setVideoType(String videoType) {this.videoType = videoType;}

    @Override
    public void spinDisc() {
        System.out.println(this.getName() + " DVD spins at a rate of " + this.getSpinRate());
    }

}
