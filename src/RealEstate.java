public class RealEstate {
  private User[] usersArray;
  private Property[] properties;
  private City[] cities;


  public RealEstate(User user , City city){
    City[] array = new City[10];
    // this.users[i] = user.getUserName();


  }

  public void createUser(String username , String phoneNumber,String password){
    User user = null;
    String tempUsername ;
    do {
     tempUsername = username;
    }while (user.getUserName().equals(usersArray));
    String tempPassword;
    do {
tempPassword = password;

    }while (password.length()<5 &&!( password.contains("$%_")) && !(password.contains("1234567890")));


      String tempPhoneNumber;
    do {
      tempPhoneNumber = phoneNumber;
    }while (validPhoneNumber(phoneNumber,user));

    User newUser= new User(tempUsername,"123", tempPhoneNumber, false);

  }

  public static boolean validPassword(String password) {
    boolean isValid = false;
      isValid =true;    if (password.contains("$") || password.contains("_") || password.contains("%") ||!password.contains("1") || !password.contains("2") || !password.contains("3")
            || !password.contains("4") || !password.contains("5") || !password.contains("6")
            || !password.contains("7")|| !password.contains("8")|| !password.contains("9")|| !password.contains("0")){

    }
    return isValid;
  }
  public static boolean validPhoneNumber (String password, User user) {
    int validLengthPhoneNumber = user.getPhoneNumber().length();
    boolean isValid = false;
    if ((validLengthPhoneNumber != 10) &&!password.contains("1") || !password.contains("2") || !password.contains("3")
            || !password.contains("4") || !password.contains("5") || !password.contains("6")
            || !password.contains("7")|| !password.contains("8")|| !password.contains("9")|| !password.contains("0")){
      isValid =true;
    }
    return isValid;
  }

  User login(){
    // to user :int counter=0;
    return null;
  }
  boolean postNewProperty(User user){
    int postCount ;
    boolean amountOfAdvertising=true;

    return amountOfAdvertising;
  }
  void removeProperty(User use){

  }
  void printAllProperties(){

  }
  void printProperties (User user){

  }
  Property[] search (){

    return new Property[0];
  }
}
// did not even start


    /*public void createUser(users){
      System.out.println("enter your user name");
      while(userName==existedUserName){          // צריך ליצור מעין מערך שמאחסן את כל המשתמשים
        System.out.println("the username you chose already exists, please choose again");
        userName=user.nextString;
        if(userName!=existedUserName){
          System.out.println("please choose your password");
          passWord=user.nextString;
          char[] CheckPassWord= new char[];
*/