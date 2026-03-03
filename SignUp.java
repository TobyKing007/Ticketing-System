import java.util.Scanner;
public class SignUp{
 static Scanner input = new Scanner(System.in);

public static void main(String[] args){

menu();
register();



}

//
//ArrayList <Interger> register = new Arraylist<>();
//ArrayList <String> events = new Arraylist<>();
//ArrayList <Double> host = new Arraylist<>();


public static void menu(){



System.out.println("**************************************");
System.out.println("BOOKNOWNOW TICKET APP MENU");
System.out.println("**************************************");

//while (true);
for(int count = 0; count <= 50; count ++){
System.out.println("Press 1 To Sign in/Register\nPress 2 to Create Events\nPress 3 to Find Event\nPress 4 to generate User ID\nPress 5 for Wallet\nto Press 4 To Exit: ");
int menu = input.nextInt();

if(menu == 1){
register();

}

if(menu == 4){
   System.out.print("See you another time 🤗️\n");
    break;




}


}
}




public static void register() {


System.out.println("********************************************************");
System.out.println("WELCOME TO BOOKNOWNOW TICKET APP SIGN UP/SIGN IN PAGE");
System.out.println("**********************************************************");


//while{
System.out.println("Press 1 To SignUp\nPress 2 For User Sign in\nPress 3 For Host Sign in\nPress 4 To Exit: ");
int details = input.nextInt();
input.nextLine();


if(details == 1){

    System.out.println("************************");
    System.out.println("LET'S GET YOU STARTED");
    System.out.println("************************");


    System.out.println("Are you a User or Host?: ");
    String userHost = input.nextLine();


    if(userHost.equalsIgnoreCase("User")){

    System.out.println("Register below");
    System.out.println("**********************");
    
    System.out.println("Enter Last name: ");
    String name = input.nextLine();

    System.out.println("Enter First Name: ");
    String firstName = input.nextLine();

    System.out.println("How did you hear about the show: ");
    String hear = input.nextLine();


    System.out.println("Enter Email Address: ");
    String email = input.nextLine();

    System.out.println("Create Password: ");
    String password = input.nextLine();
    
    System.out.println("Enter Discount Code: ");
    int code = input.nextInt();

    System.out.println("Enter Age: ");
    int age = input.nextInt();

    System.out.println("Press 1 to save  or Press 0 to go back Menu");
    int saveMenu = input.nextInt();

    if(saveMenu == 0){
//    break;


    }

    if(saveMenu == 1){
    System.out.println(">>>>> >>> >>> Saving");
    System.out.println("Saved");


}

}
    if(userHost.equalsIgnoreCase("Host")){


    System.out.println("Register below");
    System.out.println("**********************");
    
    System.out.println("Enter Company name");
    String nameOfEvent = input.nextLine();

    System.out.println("Enter Company Location ");
    String eventLocation = input.nextLine();


    System.out.println("Enter Company Email Address: ");
    String emailAddress = input.nextLine();

    System.out.println("Create Password: ");
    String eventPassword = input.nextLine();

    System.out.println("Create companyCode: ");
    int companyCode = input.nextInt();
    

    

    System.out.println("Press 1 to save  or Press 0 to go back Menu");
    int save = input.nextInt();

    if(save == 0){
//    break;


    }

    if(save == 1){
    System.out.println(">>>>> >>> >>> Saving");
    System.out.println("Saved");


}
}

    
    //    
//System.out.println("Press 1 to save  or Press 0 to go back Menu");
//int saveMenu2 = input.nextInt();
//
}


    if(details == 2){

    System.out.println("WELCOME BACK USER, KINDLY SIGN IN");
    System.out.println("**********************");
    
    System.out.println("Enter FullName: ");
    String fullName = input.nextLine();

    System.out.println("Enter Password: ");
    String pass = input.nextLine();

    System.out.println("Press 4 to log in or 0 to exit: ");
    int login = input.nextInt();

    if(login == 4){
    System.out.println("Login Successsfull");

}
    else{
        System.out.println("Thanks for coming");

}
}


    if(details == 3){

    System.out.println("WELCOME BACK HOST, KINDLY SIGN IN");
    System.out.println("**********************");
    
    System.out.println("Enter Company Name: ");
    String fullName = input.nextLine();

    System.out.println("Enter Password: ");
    String pass = input.nextLine();

    System.out.println("Press 4 to log in: ");
    int login = input.nextInt();
    if(login == 4){
    System.out.println("Login Successsfull");

}
    else{
     System.out.println("Thanks for coming");

}

    if(details == 4){
    System.out.print("See you another time 🤗️");




}


    }
    
}



}





