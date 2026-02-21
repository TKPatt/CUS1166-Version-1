public class Client {
    private String clientID;
    private String approxJobDuration;
    private String jobDeadline;

    // Default constructor
    public Client() {
    }

    // Parameterized constructor
    public Client(String clientID, String approxJobDuration, String jobDeadline) {
        this.clientID = clientID;
        this.approxJobDuration = approxJobDuration;
        this.jobDeadline = jobDeadline;
    }

    // Getter for clientID
    public String getClientID() {
        return clientID;
    }

    // Setter for clientID
    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    // Getter for approxJobDuration
    public String getApproxJobDuration() {
        return approxJobDuration;
    }

    // Setter for approxJobDuration
    public void setApproxJobDuration(String approxJobDuration) {
        this.approxJobDuration = approxJobDuration;
    }

    // Getter for jobDeadline
    public String getJobDeadline() {
        return jobDeadline;
    }

    // Setter for jobDeadline
    public void setJobDeadline(String jobDeadline) {
        this.jobDeadline = jobDeadline;
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "Client{" +
                "clientID='" + clientID + '\'' +
                ", approxJobDuration='" + approxJobDuration + '\'' +
                ", jobDeadline='" + jobDeadline + '\'' +
                '}';
    }
}