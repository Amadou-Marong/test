package assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
     ArrayList<String> categories = new ArrayList<String>();
	 ArrayList<String> items = new ArrayList<String>();
	 private ArrayList<Double> prices = new ArrayList<Double>();
	 private double totalBill = 0;
	 boolean quit = false;
	 	 
	 //////////////////////////////////////////////////////////////
	 String newCategoryName;
	 String newItemName;
	 double newItemPrice;
	 private ArrayList<String> newCategories = new ArrayList<String>();
	 private ArrayList<String> newItemsNames = new ArrayList<String>();
	 private ArrayList<Double> newItemsPrices = new ArrayList<Double>();
	 //////////////////////////////////////////////////////////////
	// Method to display the Main Menu 
	public void mainMenu() {
		 System.out.println();
		 System.out.println("***************************************************************************************");
		 System.out.println("Press 1 to choose from the list of categories, 2 to create new category or Q to quit");
		 System.out.println(categories);		 
	}
	
	//Method to choose from the categories list 
	public void selectCategories() {
		 System.out.println();
		 System.out.println("***************************************************************************************");
		 System.out.println("Press 1 to select " + categories.get(0));
		 System.out.println("Press 2 to select " + categories.get(1));
		 System.out.println("Press 3 to select " + categories.get(2));
	}
	
	//********************** CARS CATEGORY START HERE ******************************//
	//Method to display Cars and their associated Prices 
	public void carsAndPrices() {
		 System.out.println();
		 System.out.println("***************************************************************************************");
		 System.out.println("CARS ----------------------------- "+"PRICES " );
		 System.out.println(items.get(0)+" -------------------- $"+prices.get(0));
		 System.out.println(items.get(1)+" -------------------- $"+prices.get(1));
		 System.out.println(items.get(2)+" -------------------- $"+prices.get(2));
		 
	}
	//Method to select from Car items
	public void selectCars() {
		 System.out.println();
		 System.out.println("***************************************************************************************");
		 System.out.println("Press 1 to select " + items.get(0));
		 System.out.println("Press 2 to select " + items.get(1));
		 System.out.println("Press 3 to select " + items.get(2));
		 
		 // Create Variable to store the choice of Car and add its price to the total bill 
		 String choice = in.next();
		 switch(choice) {
		 case "1":
			 totalBill = totalBill + prices.get(0);
			 break;
		 case "2":
			 totalBill = totalBill + prices.get(1);
			 break;
		 case "3":
			 totalBill = totalBill + prices.get(2);
			 break; 
		 default: System.out.println("invalid input try again");
		 }
		 
	}
	//////////////// CAR CATEGORY ENDS HERE ///////////////////
	
//************************************* CLOTHES CATEGORY START HERE *****************************************//

	//Method to display Clothes and associated Prices
	public void clothesAndPrices() {
		 System.out.println();
		 System.out.println("***************************************************************************************");
		 System.out.println("ClOTHES --------------------------- "+"PRICES " );
		 System.out.println(items.get(3)+" -------------------- $"+prices.get(3));
		 System.out.println(items.get(4)+" -------------------- $"+prices.get(4));
		 System.out.println(items.get(5)+" -------------------- $"+prices.get(5));
		
	}
	//Method to choose from Clothes list
	public void selectClothes() {
		 System.out.println();
		 System.out.println("***************************************************************************************");
		 System.out.println("Press 1 to select " + items.get(3));
		 System.out.println("Press 2 to select " + items.get(4));
		 System.out.println("Press 3 to select " + items.get(5));
		 
		 // Create Variable to store the choice of Cloth and add its price to the total bill
		 String choice = in.next();
		 switch(choice) {
		 case "1":
			 totalBill = totalBill + prices.get(3);
			 break;
		 case "2":
			 totalBill = totalBill + prices.get(4);
			 break;
		 case "3":
			 totalBill = totalBill + prices.get(5);
			 break; 
		 default: System.out.println("invalid input try again");
		 }
	}	
//**************************** ACCESSORIES CATEGORY START HERE *********************************//
	// Display Accessories and their associated Prices
	public void accessoriesAndPrices() {
		 System.out.println();
		 System.out.println("***************************************************************************************");
		 System.out.println("ACCESSORIES ---------------------- "+"PRICES " );
		 System.out.println(items.get(6)+" -------------------- $"+prices.get(6));
		 System.out.println(items.get(7)+" -------------------- $"+prices.get(7));
		 System.out.println(items.get(8)+" -------------------- $"+prices.get(8));
	}
	//Choose from List of Accessories 
	public void selectAccessories() {
		 System.out.println();
		 System.out.println("***************************************************************************************");
		 System.out.println("Press 1 to select " + items.get(6));
		 System.out.println("Press 2 to select " + items.get(7));
		 System.out.println("Press 3 to select " + items.get(8));
		 
		// Create Variable to store the choice of Accessory and add its price to the total bill 
		 String choice = in.next();
		 switch(choice) {
		 case "1":
			 totalBill = totalBill + prices.get(6);
			 break;
		 case "2":
			 totalBill = totalBill + prices.get(7);
			 break;
		 case "3":
			 totalBill = totalBill + prices.get(8);
			 break; 
		 default: System.out.println("invalid input try again");
		 }
	}
//////////////// ACCESSORIES CATEGORY ENDS HERE ////////////////////////
	//////////////////// NEW ITEMS STARTS ///////////////////////////////
	
	// Method to get all new Items Names
	public void getNewItemsNames() {
		for(int i=0;i<newItemsNames.size();i++) {
			System.out.println(newItemsNames.get(i) + " -------------------- " + newItemsPrices.get(i));
		}
	}
	
	/////////////////// NEW ITEMS ENDS /////////////////////////////////////
	// Method to Add New Category and Items
	public void addItems(String itemName, double price) {
		items.add(itemName);
		prices.add(price);
	//	totalBill = totalBill + price;
	//	return totalBill;		
	}
	///////////////////////////////////////////////////////////////////////////////
	//Create Scanner object
	Scanner in = new Scanner(System.in);

	// Create an instance of App Class
   public App() {
	 
	 // Add Categories  
	     categories.add("CARS");
		 categories.add("CLOTHES");
		 categories.add("ACCESSORIES");
		
	   // add Cars and the prices associated with each Car
		  addItems("BENZ",30000);
		  addItems("BMW",35000);
		  addItems("HONDA",33000);

	     // add Clothes and Prices associated with each Cloth
	     addItems("T-SHIRT",23);
	     addItems("LONG SLEEVE",23.2);
	     addItems("JEAN",24);
	     
	     // add Accessories and Prices associated with each Accessory
	     addItems("WRIST-WATCH",50);
	     addItems("SHOCKS",5);
	     addItems("SANDAL",25);		     
	   //Loop to keep the App running for as long as the user wants
	   boolean start = true;
	   while(start&& !this.quit) {
		 
		 //Displays the Main Menu	
			 mainMenu();                        
			 
			 /*Checks what the user enters in the menu and store it a variable
			  if the user enters 1 then user would choose from the available choices
			  else if the user enters 2 then the user would add a new category*/
			 try {
	 		 String choice = in.next();
	 		
			 if(choice.equals("1")) {
				 selectCategories();
				 			
					 // Variable to store choice of category
				    int chooseCat = in.nextInt();
		
				    //Checks if the user chooses Car Category
				    if(chooseCat==1) {
					    carsAndPrices();
					    selectCars();	
					    System.out.println("TOTAL BILL: " + "$" + totalBill);
					   //Checks if the user chooses Clothes Category
				    }else if(chooseCat==2) {
					    clothesAndPrices();
					    selectClothes();
			            // Keeps track of the Total Bill
					    System.out.println("TOTAL BILL: " + "$" + totalBill);
					    //Checks if the user chooses Accessories Category
				    }else if(chooseCat==3) {
					    accessoriesAndPrices();
					    selectAccessories();
	                    // Keeps track of the Total Bill
					    System.out.println("TOTAL BILL: " + "$" + totalBill);
				      // Checks if the User Chooses New Categories
			        }else {
						//Asks the user to try again if the user enters a wrong input
						 System.out.println("invalid input try again");
					}
				    
				 // Checks if the user chooses to add new Category to the categories
			 }else if(choice.equals("2")) {
				 System.out.println("Enter Name of new Category");
				 String newCategoryName = in.next();
				 this.newCategoryName = newCategoryName;
				 categories.add(newCategoryName);
				 newCategories.add(newCategoryName);
				 System.out.println(newCategoryName +" has been added to categories \n" + categories);
				 System.out.println("Enter 1 to add items for "+ newCategoryName + " or any key to close");	 
	
				 String addItems = in.next();
				 boolean done = false;
				 while(!done && addItems.equalsIgnoreCase("1")) {
					 System.out.println("Enter new item Name or 0 to close");
			         String newItemName = in.next();
			         
			         if(newItemName.equalsIgnoreCase("0")) {
			        //	 done = true;
			        	 //////////////////////////////////////////////////////////////////////
							System.out.println("ITEMS ------------------------ PRICES");
							getNewItemsNames();
							for(int i = 0; i < newItemsPrices.size(); i++) {
							   int startIndex = i+1;
							   System.out.println("Press " + startIndex + " to select " + newItemsNames.get(i) + "or 0 to return");
							   int select = in.nextInt();
							   if(select==startIndex) {
								   totalBill = totalBill + newItemsPrices.get(i);
								   System.out.println("Total Bill: " + totalBill);
							   }else if(select == 0){
								   System.out.println("Total Bill: " + totalBill);
								   done = true;
							   }else {
								   System.out.println("invalid try again");
							   }
							}
						///////////////////////////////////////////////////////////////////////
			        	
			         }else {
			        	this.newItemName = newItemName;
				        this.newItemsNames.add(newItemName);
			            items.add(newItemName);
			            System.out.println(newItemName+" has been New Added to Items \n" + items);
			            System.out.println("Enter price for " + newItemName);
			            double newItemPrice = in.nextDouble();
			            this.newItemPrice = newItemPrice;
			            prices.add(newItemPrice);
			            newItemsPrices.add(newItemPrice);
			            System.out.println(newItemPrice + " Is Been Recorded As The Price For " + newItemName);
			         }
			        
				 }
				
				 //Sentinel value to quit from the APP
			 }else if(choice.equalsIgnoreCase("Q")){
				 System.out.println("YOUR TOTAL BILL IS " + totalBill);
				 System.out.println("GOOD BYE!!!");
				 this.quit = true;
			 }else {
				//Asks the user to try again if the user enters a wrong input
				 System.out.println("invalid input try again");
			 } 
			 
		 }catch(Exception e) {
			 System.out.println("input error try Again");
	     }
		
	   }  
   } 
   
}
