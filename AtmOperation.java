package Demo;
import java.util.*;

public class AtmOperation implements AtmOperationInterface {
    private ATM atm;
     ArrayList<String> arr=new    ArrayList<>();
    public AtmOperation(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void viewBalance() {
        System.out.println("Available Balance is: " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount <= atm.getBalance()) {
            atm.setBalance(atm.getBalance() - withdrawAmount);
            System.out.println("Collect the Cash " + withdrawAmount);
            System.out.println("Available Balance is: " + atm.getBalance());
        } else {
            System.out.println("Insufficient Balance !!");
        }
        arr.add(withdrawAmount+"Despsited successfully");
    }

    @Override
    public void depositAmount(double depositAmount) {
        atm.setBalance(atm.getBalance() + depositAmount);
        System.out.println(depositAmount + " Deposited Successfully !!");
        System.out.println("Available Balance is: " + atm.getBalance());
        arr.add(depositAmount+"Despsited successfully");
    }

    @Override
    public void viewMiniStatement() {
    	
    	  System.out.println("Initial amount 0");
    	  for(int i=0;i<arr.size();i++) {
    		  System.out.println(arr.get(i));
    	  }
    	  System.out.println("Available Balance is: " + atm.getBalance());
    }
}