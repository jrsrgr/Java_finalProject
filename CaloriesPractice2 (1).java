package JAVA_Project_275;								// By: Joshua Seymour - Modified By: John A. Castilloux
import java.util.Scanner;								//Daily recommended calorie in-take by www.livingstrong.com 
import java.util.*;									    //Calorie Counter by codereview.stackexchange.com
public class CaloriesPractice2 {						//Calorie Tracker by codereview.stackexchange.com

public static void main(String[] args) {				
    
	 // Introduction for user
    System.out.println("This program prints out a meal name and descriptive "
    + "food type list, followed\n" + "by the amount of Calories in one serving. "
    + "It then calculates the total calories\n" + "remaining to be consumed for the day "
    + "for an adult.");
    System.out.println();
    
	System.out.println("What is your name.");			//Requesting Name for User
    Scanner NameCall= new Scanner(System.in);
    String NameInput = NameCall.nextLine();
    Info user = new Info();								//Information is pulled from info.java (breaks down user input in system code)
    user.name = NameInput;

  
    System.out.println("Hello there " + NameInput + "!"); // Name is printed below
    String VerifiedAge = "no";
    do {
        System.out.println("How old are you?");
        Scanner AU = new Scanner(System.in);	//AU = age unavailable 
      
        while (!AU.hasNextInt()) {              // Requires age as an integer

              System.out.println("This needs to be a number. Please type your age using an integer. - Ex: '12, 28, 52, etc'");
              String InvaildAU = AU.next();
        }
        
        int UserAge = AU.nextInt();		 //If age is valid, continue on

    System.out.println("So," + NameInput + " you are " + UserAge + ". Is this correct?");
    System.out.println("Yes or No.");
    														
    Scanner AV = new Scanner(System.in);							// Confirms age, age is verified
    VerifiedAge = AV.nextLine();
    if ( VerifiedAge.equalsIgnoreCase("yes") ) {
        System.out.println("Thank you! You have comfired your age!");    //If yes, move on

    }
    else if (VerifiedAge.isEmpty() || VerifiedAge == null) { //If user does not enter an integer, requests to enter age again
        System.out.println("You did not meet the request.. Let's try again.");
        
        continue;
    }
    else if (VerifiedAge.equalsIgnoreCase("no"))
     System.out.println("My bad! Please enter your correct age then?");
    else {													//If user does not response, take as an invalid answer and re-try
        System.out.println("That is not a valid response. Let's try again!");
        
        continue;
    }
    user.age = UserAge;


    }while( !VerifiedAge.equalsIgnoreCase("yes") || VerifiedAge == null);

    
    String CurrentGoalCheck1 = "no";         					//Global variable
    do {
    System.out.println("What is your target calorie intake for today");
    Scanner CurrentGoal = new Scanner(System.in);

    while(!CurrentGoal.hasNextInt()) {
        System.out.println("Please enter current target calorie intake as an integer. EX: '2000'");
        String InvalidCG = CurrentGoal.next();					//If no integer, enter again using an integer
        
    }
    int CalGoal = CurrentGoal.nextInt();
    user.goal = CalGoal;
    System.out.println("Your Goal is " + CalGoal + " . Is that Correct? Yes or No?");
    Scanner CurrentgoalCheck = new Scanner(System.in);
    CurrentGoalCheck1 = CurrentgoalCheck.nextLine();
    if (CurrentGoalCheck1.equalsIgnoreCase("yes")) {
        System.out.println("Great! Your daily log will now begin!");
    }

    else if (CurrentGoalCheck1.isEmpty() || CurrentGoalCheck1 == null) {
        System.out.println("Please answer the question. Try again.");
       
        continue;
    }
    else if (CurrentGoalCheck1.equalsIgnoreCase("no")){
        System.out.println("Okay, My bad!");
    }
    else {
        System.out.println("That is not a current option. Let's try again!"); //If yes or no is not selected, re-enter
        
        continue;

    }
    int CaloGoal = CalGoal;}
    while (!CurrentGoalCheck1.equalsIgnoreCase("yes")); 

    								// (Goal - FirstIntake = RemainingGoal) then (Remaining goal - NextIntake = Remaining Goal)
    int Run = 1;
    user.CaloriesRequired = 0;
    int start = 1;
    do {
        System.out.println("Enter each calorie intake. This will subtract from your daily goal.");
        System.out.println("    Sample Foods and Meals:\n");
        System.out.println("     Meal          Descriptive Food Type      Calories Per Serving");
        System.out.println("     --------       -------------------        ------------------ ");
        System.out.println("     Breakfast     Eggs                          400              ");
        System.out.println("     Lunch         Grilled Cheese Sandwich       600              ");
        System.out.println("     Dinner        Grilled BBQ Chicken           600              ");
        System.out.println("     Breakfast     Bacon                         100              ");
        System.out.println("     Lunch         Tomato Soup                   200              ");
        System.out.println("     Lunch         Salad                         100              ");
        System.out.println("     Dinner        Cheesy Potatoes               300              ");
        System.out.println("     Dinner        Mixed Vegetables              200              ");
        System.out.println("     Breakfast     Milk                          150              ");
        System.out.println("     Lunch         Water                         0                ");
        System.out.println("     Dinner        Milk                          150              "); 
        
    Scanner II = new Scanner(System.in);

    while(!II.hasNextInt()) {
        System.out.println("Please enter your intake as an integer. EX: '250'");
        String InvalidII = II.next();  // Ensures that Initial Intake is in fact an Integer
     
}
    int InitialIntake = II.nextInt();
    user.current = user.current + InitialIntake;
    int CR = InitialIntake - user.goal;

    if (start == 1) {		//Has the user reached the recommended goal
        
    user.CaloriesRequired =user.goal - InitialIntake;

    System.out.println("You have taken in  " + InitialIntake + " calories!");
    System.out.println(" You have " + user.CaloriesRequired + " calories left!");
     System.out.println("You have taken in a total of " + user.current + " calories!");
    start++;
 
    }
    else if (user.CaloriesRequired > 0) {    			//If statement becomes false, it will no longer use else if
        user.CaloriesRequired = user.CaloriesRequired - InitialIntake;
        System.out.println("You have taken in  " + InitialIntake + " calories!");
        System.out.println(" You have " + user.CaloriesRequired + " calories left!");
         System.out.println("You have taken in " + user.current + " calories!");
    }

    else if (user.CaloriesRequired <= 0) {				//Once calories required hits or goes over target mark
     System.out.println("You have reached your goal! Congratulations!");
     System.out.println("You have taken in " + user.current + " calories!");
    }
    } while ( Run == 1);   
    
    System.out.println();

    
    
    Scanner YesNo = new Scanner(System.in);  // By: Kaitlyn Damon
        
    //you make a new object of the scanner class and store it in the variable input. 
    //Identifies whether you exercised today or not. 
    
                
    System.out.println("Did you exercise today? Yes or No");
    String yesno = YesNo.next();
     if(yesno.equals("Yes"))
     {
            System.out.println("You have received one point!");
     }
     else if(yesno.equals("No"))
     {
            System.out.println("That is okay, but you recieve 0 points! ): ");
     }
    

    Scanner sc = new Scanner(System.in); // By: Kaitlyn Damon - Modified by: John A. Castilloux
   
    System.out.println("    Sample Exercise, Duration/Reps and Calories burned:\n");

    System.out.println("     Exercise        Duration or Reps           Calories burned");

    System.out.println("     --------       -------------------        ------------------ ");

    System.out.println("     Walking                 1HR                     400          ");

    System.out.println("     Running                 1HR                     600          ");

    System.out.println("     Elyptical               1HR                     600           ");

    System.out.println("     Bicycle                 1HR                     100           ");

    System.out.println("     Push-Ups                                        200           ");
    
    System.out.println("     Sit-Ups                                         100           ");

    System.out.println("     Crunches                                        300           ");
    
    System.out.println("     Pull-Ups                                        200            ");

    System.out.println("     Swimming                1HR                     150            ");

    System.out.println("how many calories did you burn with exercise today?");
    int burned = sc.nextInt(); 
    while (burned <= 0) {
        System.out.println("You should probably move around more! Come back after you burn some (: ");
        burned = sc.nextInt(); // If the user did not burn any calories, he or she will be asked to come back after.
    }
    System.out.println("You have burned " + burned + " calories today!");

    System.out.println();
    
    
       
     // Modified StringDemo.java to make an author page
	 // By: John A. Castilloux
{
	String publication = "Project Calorie Tracker";
	
	String creation = "Created by:";
	
	String name1 = "Joshua Seymour, Project Manager"; 
	
	String name2 = "John Castilloux";
	
	String name3 = "Kaitlyn Damon";

	
	
	System.out.println(publication); 
	
	System.out.println(creation);
	
	System.out.println(name1);
	
	System.out.println(name2); 
	
	System.out.println(name3);
	
	System.out.println();

}

}// end main
}// end CalorieTracker

  


	