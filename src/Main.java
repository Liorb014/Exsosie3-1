import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] arrayOfCity = {"Ashdod" , " Tel-Aviv", "Eilat" ,"Ashkelon","Jerusalem","Rehovot","Haifa" ,"Bat-Yam" , "Baer-Sheva","Sderot"};
        String[] arrayOfStreets = {"Rimon street" , "Narkis street", "rotem street" ,"Golani street","Givati street","Oliy Agardom street","Dov Brayer street" ,"Kalanit street" , "Tamar street","Africa street"};
        Scanner user= new Scanner(System.in);
        City city = new City(arrayOfCity[0],"darom ",arrayOfStreets );
        System.out.println(city);
    }
    public static void menu(int userChoose){
        do {
            if (userChoose==1){
                createAccount();
            } else if (userChoose==2) {
                login();
            }else if (userChoose==3) {
                break;
            }
        }while (userChoose < 0||userChoose>3);
    }
    public static void createAccount (){

    }
    public static void login(){

    }
}