public class User {
    private String userName;
    private String password;
    private String phoneNumber;
    private boolean isBrokers;

    public User(String username, String password,  String phoneNumber,boolean isBrokers ){
        this.userName = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.isBrokers = isBrokers;
            }

    void getUserName(String username) {
        this.userName = username;
    }

    void getPassword() {
        this.password = password;

    }
    void getPhoneNumber(){
        this.phoneNumber = phoneNumber;
    }
}
