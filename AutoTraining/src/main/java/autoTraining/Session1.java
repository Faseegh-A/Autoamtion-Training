package autoTraining;
public class Session1 {


    public static void firstlines(){
        String message = "Hello, Welcome!";
        String addon = "To our first session of Automation Training with Bas";
        System.out.printf("%S %s \n%n%n", message,addon);
    }

    public static void actvity1(String text, int n){
        System.out.println("Hello, "+text+"!");
        System.out.printf("Hello %s, it is now %d%n%n",text,n);
    }

    public static void printHardCodeduserData(){
        System.out.println("Data for user 1");
    }

    public static void printvariableUserData(String name, int age){
        System.out.printf("User %s is %d years old.\n",name,age);
    }

    public static String returnUserdata(String name, int age){
        String text = String.format("User %s is %d years old.",name,age);
        return text;
    }


    public static void main(String[] args){
        firstlines();

        String myPlace = "Clickatell";
        int year = 2022;

        actvity1(myPlace,year);
        actvity1("Future you",2052);

        System.out.println("Activity 2:\n");

        printHardCodeduserData();
        printvariableUserData("Faseegh", 26);

        System.out.println(returnUserdata("Faseegh Abrahams", 26));
    }
}
