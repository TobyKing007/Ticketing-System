import java.util.Scanner;
public class Wallet{
 static Scanner input = new Scanner(System.in);

public static void main(String[] args){

    System.out.println("Enter amount to fundWallet: ");
    double amount = input.nextDouble();
    
   fundWallet(amount); 

}


    public static void fundWallet(double amount){
     

    int userWallet = 0;


    if (amount > 0){
    userWallet += amount;
    System.out.println("Wallet funded successfully!");

    }
    else{
    System.out.println("Invalid amount!");
    }



}


  public boolean payForTicket(double amount){

    int wallet = 0;
    
    if (wallet >= amount){
        wallet -= amount;
            return true;
        
    }
        else{
        return false;
}

    }
    
}
