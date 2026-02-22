public class Owner {
    private String ownerID;
    private String vehicleInfo;
    private String approxResidencyTime;

    // Default constructor
    public Owner() {
    }

    // Parameterized constructor
    public Owner(String ownerID, String vehicleInfo, String approxResidencyTime) {
        this.ownerID = ownerID;
        this.vehicleInfo = vehicleInfo;
        this.approxResidencyTime = approxResidencyTime;
    }

    // Getter for ownerID
    public String getOwnerID() {
        return ownerID;
    }

    // Setter for ownerID
    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }

    // Getter for vehicleInfo
    public String getVehicleInfo() {
        return vehicleInfo;
    }

    // Setter for vehicleInfo
    public void setVehicleInfo(String vehicleInfo) {
        this.vehicleInfo = vehicleInfo;
    }

    // Getter for approxResidencyTime
    public String getApproxResidencyTime() {
        return approxResidencyTime;
    }

    // Setter for approxResidencyTime
    public void setApproxResidencyTime(String approxResidencyTime) {
        this.approxResidencyTime = approxResidencyTime;
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "Owner{" +
                "ownerID='" + ownerID + '\'' +
                ", vehicleInfo='" + vehicleInfo + '\'' +
                ", approxResidencyTime='" + approxResidencyTime + '\'' +
                '}';
    }
}