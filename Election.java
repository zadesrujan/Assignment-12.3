package vote;
//here we cretaed package as vote which that organizes a set of related classes and interfaces.
import java.io.IOException;
import java.util.Scanner;

public class Election {

	static int age;
	public static void main(String[] args) {
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
		//void : returns to no value.
		//main : is special because it will start the program.
		// TODO Auto-generated method stub

		System.out.print("enter age");
		//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is output.
       
		 Scanner sc =new Scanner(System.in);
		 //taking new scanner sc
		    int Scanner=sc.nextInt();
		    
	     if(age<18) { 
	    	 //age lessthan 18
	    	
	      System.out.println("not eligible for vote"); 
	    //system : is a class in java language pacakge.
  		//out : static member of the system class.
  		//println : to print what is output.
        
	     }
	    	 else {
	    	 
	    {
	      System.out.println("eligible for vote");  
	    //system : is a class in java language pacakge.
  		//out : static member of the system class.
  		//println : to print what is output.
	    	 
	}}
	    	 }
	    	    
	      
	}


