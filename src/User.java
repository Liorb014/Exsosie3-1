public class User {
   final private String userName;
   final private String password;
   final private String phoneNumber;
  final  private boolean isBrokers;
    public User(String userName, String password,  String phoneNumber,boolean isBrokers ){
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.isBrokers = isBrokers;
            }
private String getPassword(){
        return password;
}
public String getUserName(){
        return userName;
    }
    public String getIsBroker(){
        if (isBrokers){
            return "real estate agent";
        }else return "not an agent";
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
//need minor adjustment