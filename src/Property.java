public class Property {
    private City city;
    private String street;
    private int amountOfRooms;
    private double price;
    private String type;
    private boolean isForRenting;
    private int houseNumber;
    private int floor;
    private String sellerName;

    public String getTheCityOfTheProperty(){
        return this.city.getCityName();
    }
    public String getNameOfTheStreet(){
        return this.street;
    }

}
