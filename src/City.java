import java.util.Arrays;
import java.util.List;

public class City {
    private final String cityName;
    private final String area;
    private final String[] listOfStreets;

    public City(String cityName,String area,String[] listOfStreets){
        this.cityName = cityName;
        this.area = area;
        this.listOfStreets = listOfStreets;
    }
    public String getCityName(){
        return this.cityName;
    }
    public String getArea(String area){
        return area;
    }
    public String[] getListOfStreets(){
        return listOfStreets;
    }
    public String toString(){
        return "city name : " + cityName + "\n area : " + area +"\n  list of streets :" + Arrays.toString(listOfStreets) ;
    }
}
