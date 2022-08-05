import java.util.Scanner;

public class Switch {
    public static  void main(String[]args){
        Scanner take=new Scanner(System.in);
        System.out.print("Input a day:");
        String day=take.nextLine();

        switch (day){
            case "Monday":
                System.out.println("This is Monday");
                break;

            case "Tuesday":
                System.out.println("This is Tuesday");
                break;

            case "Wednesday":
                System.out.println("This is Wednesday");
                break;

            default:
                System.out.println("This is not a day");
        }
    }
}
