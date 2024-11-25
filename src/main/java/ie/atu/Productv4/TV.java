package ie.atu.Productv4;

public class TV extends Product{
    private String screenSize;
    private String manufacture;

    public TV(){
        super();
        screenSize = "";
        manufacture="";
        count++;
    }
    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getArtist() {
        return screenSize;
    }
    public String getLabel() {
        return manufacture;
    }

    @Override
    public String toString() {
        return "TV{" +
                "screenSize='" + screenSize + '\'' +
                ", manufacture='" + manufacture + '\'' +
                '}';
    }
}
