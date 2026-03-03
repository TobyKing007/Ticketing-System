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


  public static void bookTicket(int quantity){

    if (quantity <= 0){
     System.out.println("Invalid quantitiy");
    return;
}
    if (quantity > ticketAvailable){
     System.out.println("Not enough quantity!");
       return;
    }
    
   double totalCost = quantity * ticketPrice;
    if (userWallet < totalCost){
        System.out.println("Insufficient wallet balance !");
        return;
    }
    userWallet -= totalCost;
    plannerWallet += totalCost;
    ticketAvailable -= quantity;
    System.out.println("Booking successful!");
    System.out.println("Cost is " + totalCost);
}

}



