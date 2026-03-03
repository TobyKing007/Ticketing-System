public class Ticketing System{

    public static void fundWallet(double amount){
     

    if (amount > 0){
    userWallet += amount;
    System.out.println("Wallet funded successfully!");

    }
    else{
    System.out.println("Invalid amount!");
    }



}


  public boolean payForTicket(double amount){
    if (wallet >= amount){
        wallet -= amount;
            return true;
        
    }
        else{
        return false;
}

    }
    
}

