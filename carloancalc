// Calculates monthly car loan payments
// 2018 Lexus RX at $43,270 with bad credit interest rate of 13% and 5 yr loan
// Down payment of 10k (because of my trade-in, high estimate) 
// Myla Fairchild

 

public class CarLoan {

                public static void main(String[] args) {

 
  int carLoan = 43270;
  int loanLength = 5;
  int interestRate = 13;
  int downPayment = 10000;

   
    if (loanLength <= 0 || interestRate <= 0) {
      System.out.println("Error! You must take out a valid car loan.");
    } else if (downPayment >= carLoan) {
      System.out.println("The car can be paid in full.");
    } else {

      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance / months;
      int interest = (monthlyBalance * interestRate) / 100;
      int monthlyPayment = monthlyBalance + interest;

      System.out.println(monthlyPayment);
      
     } 
   }
}
