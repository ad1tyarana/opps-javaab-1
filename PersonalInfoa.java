import java.util.Scanner;

public class PersonalInfoa {
    public static void main(String[] args){
        Scanner user_info = new Scanner(System.in);
 System.out.print("Enter your Full Name :");
    String name = user_info.nextLine();
    System.out.print("Enter your address :");  
    String address = user_info.nextLine(); 
    System.out.println("User Information");
    System.out.println("Name : " + name);
    System.out.println("Address : " + address);
    }
}