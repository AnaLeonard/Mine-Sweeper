//LINK TO YOUTUBE VIDEO: https://youtu.be/uI6aiDtfgQY
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userAnswer = " ";// answer to whether they want to order or not
		String UserName = " ";// what they are named
		int userNumChoice = 0;// What they number of the Appetizer they want
		int userNumChoice2 = 0;// What they number of the main they want
		int userNumChoice3 = 0;// What they number of the dessert they want
		int toppingNum = 0;// What toppingNum they want Appetizer
		int toppingNum2 = 0;// What toppingNum they want Main Course
		int toppingNum3 = 0;// What toppingNum they want Dessert
		String AppTopping = " ";
		String MainTopping = " ";
		String DessTopping = " ";
		String a = "Yes";
		String b = "No";
		String Appetizer = " ";
		String Main = " ";
		String Dessert = " ";
		int userSelection = 0;// what they want to order from MENU

		System.out.println("Welcome to the food festival!");
		System.out.println("Would you like to place an order?");
		userAnswer = scnr.next();
//It will keep prompting the user for a yes or no answer
		while ((!(userAnswer.equalsIgnoreCase(b)) && (!(userAnswer.equalsIgnoreCase(a))))) {
			System.out.println("Would you like to place an order?");
			userAnswer = scnr.next();
		}
//if user says yes			
		if (userAnswer.equalsIgnoreCase(a)) {
			System.out.println(userAnswer + ":");
			System.out.println("What is your name for the order?");
			UserName = scnr.next();
			System.out.println("Select from menu, " + UserName + ":");
//main menu			
			System.out.println("	0-Nothing");
			System.out.println("	1-Appetizer");
			System.out.println("	2-Main Course");
			System.out.println("	3-Dessert");
			System.out.println("Enter the number for your selection:");
			userSelection = scnr.nextInt();
//if user says nothing			
			if (userSelection == 0) {
				System.out.println("Here is your order, " + UserName + ";");
				System.out.println("Nothing");
			}

//if user chooses numbers 1 to 3 in the menu it will keep asking them until this while is false	
			while(userSelection == 1||userSelection == 2||userSelection == 3) {	
//Appetizer menu begins				
				if (userSelection == 1) {
					System.out.println("Appetizer Menu: ");
					System.out.println("	0-Nothing");
					System.out.println("	1-Flautas");
					System.out.println("	2-Elote");
					System.out.println("	3-Chicharron Preparado");
					System.out.println("Enter the number for your appetizer selection: ");
					userNumChoice = scnr.nextInt();
					switch(userNumChoice) {
					case 1:
						Appetizer+="Flautas";
						break;
					case 2:
						Appetizer+="Elote";
						break;	
					case 3:
						Appetizer+="Chicharron Preparado";
						break;	
					}
					System.out.println("Toppings Menu: ");
					System.out.println("	0-Nothing");
					System.out.println("	1-Cream and Cheese");
					System.out.println("	2-Guacamole");
					System.out.println("	3-Chile");
					System.out.println("Enter the number for your topping selection: ");
					toppingNum = scnr.nextInt();
					//	count++;
						switch(toppingNum) {
						case 1:
							AppTopping+="Cream and Cheese"+(toppingNum!=0? ", ":"");
							break;
						case 2:
							AppTopping+="Guacamole"+(toppingNum!=0? ", ":"");
							break;
						case 3:
							AppTopping+="Chile"+(toppingNum!=0? ", ":"");
							break;	
						}
						while ((toppingNum > 0) && (toppingNum <= 3)) {
							if (toppingNum == 1) {
								System.out.println("Toppings Menu: ");
								System.out.println("	0-Nothing");
								System.out.println("	1-Cream and Cheese");
								System.out.println("	2-Guacamole");
								System.out.println("	3-Chile");
							} else if (toppingNum == 2) {
								System.out.println("Toppings Menu: ");
								System.out.println("	0-Nothing");
								System.out.println("	1-Cream and Cheese");
								System.out.println("	2-Guacamole");
								System.out.println("	3-Chile");
							} else if (toppingNum == 3) {
								System.out.println("Toppings Menu: ");
								System.out.println("	0-Nothing");
								System.out.println("	1-Cream and Cheese");
								System.out.println("	2-Guacamole");
								System.out.println("	3-Chile");
							}
							System.out.println("Enter the number for your topping selection: ");
							toppingNum = scnr.nextInt();
						//	count++;
							switch(toppingNum) {
							case 1:
								AppTopping+="Cream and Cheese" + (toppingNum!=0? ", ":"");
								break;
							case 2:
								AppTopping+="Guacamole"+ (toppingNum!=0? ", ":"");
								break;
							case 3:
								AppTopping+="Chile"+ (toppingNum!=0? ", ":"") ;
								break;	
							}
						
					}
			    	if (toppingNum == 0 ) {
		            	System.out.println("Appetizer Menu: ");
		            	System.out.println("	0-Nothing");
		            	System.out.println("	1-Flautas");
		            	System.out.println("	2-Elote");
		            	System.out.println("	3-Chicharron Preparado");
		            	System.out.println("Enter the number for your appetizer selection: ");
		            	userNumChoice = scnr.nextInt();
		        	}
				}
				else if (userSelection == 2) {
//Main Course menu				
					System.out.println("Main Course Menu: ");
					System.out.println("	0-Nothing");
					System.out.println("	1-Enchiladas");
					System.out.println("	2-Tacos");
					System.out.println("	3-Sopes");
					System.out.println("Enter the number for your main selection: ");
					userNumChoice2 = scnr.nextInt();
					switch(userNumChoice2) {
					case 1:
						Main+="Enchiladas";
						break;
					case 2:
						Main+="Tacos";
						break;	
					case 3:
						Main+="Sopes";
						break;	
					}
					System.out.println("Toppings Menu: ");
					System.out.println("	0-Nothing");
					System.out.println("	1-Cream and Cheese");
					System.out.println("	2-Lettuce");
					System.out.println("	3-Chile");
					System.out.println("	4-Tomato");
					System.out.println("Enter the number for your topping selection: ");
					toppingNum2 = scnr.nextInt();
					switch(toppingNum2) {
					case 1:
						MainTopping+="Cream and Cheese"+ (toppingNum2==1? ", ":"");
						break;
					case 2:
						MainTopping+="Lettuce"+ (toppingNum2==2? ", ":"");
						break;	
					case 3:
						MainTopping+="Chile"+ (toppingNum2==3? ", ":"");
						break;
					case 4:
						MainTopping+="Tomato"+ (toppingNum2==4? ", ":"");
						break;	
					case 0:
						MainTopping.replace(", ", "") ;
					}
					while ((toppingNum2 > 0) && (toppingNum2 <= 4)) {
						if (toppingNum2 == 1) {
							System.out.println("Toppings Menu: ");
							System.out.println("	0-Nothing");
							System.out.println("	1-Cream and Cheese");
							System.out.println("	2-Lettuce");
							System.out.println("	3-Chile");
							System.out.println("	4-Tomato");

						} else if (toppingNum2 == 2) {
							System.out.println("Toppings Menu: ");
							System.out.println("	0-Nothing");
							System.out.println("	1-Cream and Cheese");
							System.out.println("	2-Lettuce");
							System.out.println("	3-Chile");
							System.out.println("	4-Tomato");
						}

						else if (toppingNum2 == 3) {
							System.out.println("Toppings Menu: ");
							System.out.println("	0-Nothing");
							System.out.println("	1-Cream and Cheese");
							System.out.println("	2-Lettuce");
							System.out.println("	3-Chile");
							System.out.println("	4-Tomato");

						} else if (toppingNum2 == 4) {
							System.out.println("Toppings Menu: ");
							System.out.println("	0-Nothing");
							System.out.println("	1-Cream and Cheese");
							System.out.println("	2-Lettuce");
							System.out.println("	3-Chile");
							System.out.println("	4-Tomato");
						}
						System.out.println("Enter the number for your topping selection: ");
						toppingNum2 = scnr.nextInt();
						switch(toppingNum2) {
						case 1:
							MainTopping+="Cream and Cheese"+ (toppingNum2==1? ", ":"");
							break;
						case 2:
							MainTopping+="Lettuce"+ (toppingNum2==2? ", ":"");
							break;	
						case 3:
							MainTopping+="Chile"+ (toppingNum2==3? ", ":"");
							break;
						case 4:
							MainTopping+="Tomato"+ (toppingNum2==4? ", ":"");
							break;	
						case 0:
							MainTopping.replace(", ", "") ;	
						}	
					
					}	
					if (toppingNum2 == 0) {
						System.out.println("Main Course Menu: ");
						System.out.println("	0-Nothing");
						System.out.println("	1-Enchiladas");
						System.out.println("	2-Tacos");
						System.out.println("	3-Sopes");
						System.out.println("Enter the number for your main selection: ");
						userNumChoice2 = scnr.nextInt();
					}
				}
				else if (userSelection == 3) {
//APPETIZER menu				
					System.out.println("Dessert Menu: ");
					System.out.println("	0-Nothing");
					System.out.println("	1-Tres Leches Cake");
					System.out.println("	2-Flan");
					System.out.println("	3-Churros");
					System.out.println("Enter the number for your dessert selection: ");
					userNumChoice3 = scnr.nextInt();
					switch (userNumChoice3) {
					case 1:
						Dessert += "Tres Leches Cake";
						break;
					case 2:
						Dessert += "Flan";
						break;
					case 3:
						Dessert += "Churros";
						break;
					}
					System.out.println("Toppings Menu: ");
					System.out.println("	0-Nothing");
					System.out.println("	1-Caramel");
					System.out.println("	2-Cholocate");
					System.out.println("	3-Syrup");
					System.out.println("Enter the number for your topping selection: ");
					toppingNum3 = scnr.nextInt();
					switch (toppingNum3) {
					case 1:
						DessTopping += "Caramel"+ (toppingNum3!=0? ", ":"");
						break;
					case 2:
						DessTopping += "Chocolate"+ (toppingNum3!=0? ", ":"");
						break;
					case 3:
						DessTopping += "Syrup"+ (toppingNum3!=0? ", ":"");
						break;
					}
					while ((toppingNum3 > 0) && (toppingNum3 <= 3)) {
						if (toppingNum3 == 1) {
							System.out.println("Toppings Menu: ");
							System.out.println("	0-Nothing");
							System.out.println("	1-Caramel");
							System.out.println("	2-Cholocate");
							System.out.println("	3-Syrup");
						}
						else if (toppingNum3 == 2) {
							System.out.println("Toppings Menu: ");
							System.out.println("	0-Nothing");
							System.out.println("	1-Caramel");
							System.out.println("	2-Cholocate");
							System.out.println("	3-Syrup");
						}
						else if (toppingNum3 == 3) {
							System.out.println("Toppings Menu: ");
							System.out.println("	0-Nothing");
							System.out.println("	1-Caramel");
							System.out.println("	2-Cholocate");
							System.out.println("	3-Syrup");
						}
						System.out.println("Enter the number for your topping selection: ");
						toppingNum3 = scnr.nextInt();
						switch (toppingNum3) {
						case 1:
							DessTopping += "Caramel"+ (toppingNum3!=0? ", ":"");
							break;
						case 2:
							DessTopping += "Chocolate" + (toppingNum3!=0? ", ":"");
							break;
						case 3:
							DessTopping += "Syrup"+ (toppingNum3!=0? ", ":"");
							break;
						}	
					}	
					if (toppingNum3 == 0) {
						System.out.println("Dessert Menu: ");
						System.out.println("	0-Nothing");
						System.out.println("	1-Tres Leches Cake");
						System.out.println("	2-Flan");
						System.out.println("	3-Churros");
						System.out.println("Enter the number for your dessert selection: ");
						userNumChoice3 = scnr.nextInt();
					}	
				}
//when the user does not want something from the chosen menu it will return here				
				if(userNumChoice == 0||userNumChoice2 == 0||userNumChoice3 == 0) {//add userNumChoice2 and 3 
					System.out.println("Select from menu, " + UserName + ": ");
	         		System.out.println("	0-Nothing");
	               	System.out.println("	1-Appetizer");
	               	System.out.println("	2-Main Course");
	               	System.out.println("	3-Dessert");
	               	System.out.println("Enter the number for your selection:");
	               	userSelection = scnr.nextInt();
	        	} 
			}
		System.out.println("Here is your order: " + UserName);
		System.out.println("Appetizer: [" + Appetizer +": "+ AppTopping.replaceAll(", $", "") + "]");
		System.out.println("Main Course: [" + Main +": "+ MainTopping.replaceAll(", $", "") +"]");
		System.out.println("Dessert Course: [" + Dessert +": "+ DessTopping.replaceAll(", $", "")  +  "]");	
       	System.out.println("Enjoy your meal!");
		}
		if (userAnswer.equalsIgnoreCase(b)) {
			System.out.println("Thank you for stopping by, maybe next time you’ll sample our menu.");
		}		
	}
}	
			