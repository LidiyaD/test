package bank;

import java.util.ArrayList;

public class TestBank {

	public static void main(String[] args) { 
		BankLogic logic = new BankLogic();
		
		logic.addCustomer("Alex", 770907);
		logic.addCustomer("Lidiya", 780808);
		logic.addCustomer("LenA", 800505);
		
		logic.addSavingsAccount(770907);
		logic.addSavingsAccount(770907);
		logic.addSavingsAccount(780808);
		
		//////////////////////////////////
		System.out.println("GET CUSTOMER : " + logic.getCustomer(770907));
		
		/////////////////////////////////////////////
		ArrayList<String> customers = logic.getCustomers();
		System.out.println("Info about all customers\n");
		for(String cust : customers){
			System.out.println(cust);
		}
		System.out.println("################");
	
		//////////////////////////////
//		logic.changeCustomerName("Darafshi", 770909);
//		System.out.println("ÄNDRAT");
		
		/////////////////////////////
//		System.out.println("REMOVED!");
//		System.out.println(logic.removeCustomer(770907));
		
		////////////////////////////////
//		ArrayList<String> customers3 = logic.getCustomers();
//		
//		for(String custom : customers3){
//			System.out.println(custom);
//		}
		///////////////////////////////////
		System.out.println("Account received: " + logic.getAccount(770907, 1002));
		System.out.println("DEPOSIT");
		logic.deposit(770907, 1002, 100);
		System.out.println("Account deposited + 100 : " + logic.getAccount(770907, 1002));
		/////////////////////////////////////
//		logic.withdraw(444-444, 1004, 20);
//		System.out.println("WITHDRAW");
//		System.out.println("Account withdrawn : " + logic.getAccount(444-444, 1004));
		//////////////////////////
		System.out.println("CLOSE ACCOUNT");
		System.out.println(logic.closeAccount(770907, 1002));
	}
}
