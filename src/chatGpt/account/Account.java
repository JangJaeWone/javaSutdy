package chatGpt.account;

import java.util.Scanner;

public class Account {
    private String accountNumber;
    private String ownerName;
    private int balance;
     public Account(String accountNumber,String ownerName,int balance){
         this.accountNumber = accountNumber;
         this.ownerName = ownerName;
         this.balance = balance;
     }
     public void deposit(int amount){
         balance+=amount;
     }
     public void withdraw(int amount){
         balance-=amount;
     }
     public void displayInfo(){
         System.out.println(accountNumber);
         System.out.println(ownerName);
         System.out.println(balance);
     }
}
