package session3;

public class session3application {

    public static void main(String[]args){
        GetMonthName m = new GetMonthName();

        System.out.println(m.returnMonthName(8));
        System.out.println(m.returnMonthName(3));
        System.out.println(m.returnMonthName(168));

    }
}
