package exercises;

public class FizzBuzzTest {

    public static void main(String[] args){
        for (int i =1; i<=100; i++){
            if (i%3 ==0){
                if (i%5==0) {
                    System.out.println(i+": FizzBuzz");
                }
                else{
                    System.out.println(i+": Fizz");
                }
            } else if (i%5==0) {
                System.out.println(i+": Buzz");
            }
            else{System.out.println(i+"\t\tunlucky");}

        }
    }
}
