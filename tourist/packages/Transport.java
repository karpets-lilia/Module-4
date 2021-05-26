package tourist.packages;

public enum Transport {
    PLANE ("Plane"),
    BUS ("Bus"),
    SHIP ("Ship");

    private String transportType;

    Transport(String transportType) {
        this.transportType = transportType;
    }
}
