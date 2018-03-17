import java.util.Scanner;

public class Calculator {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

	   int a, b, c;
	   
	    do{
	    	System.out.println("Enter the two integers : ");
		    a = sc.nextInt();
		    b = sc.nextInt( );
		    
	    	System.out.println("Enter the operation: ");
	    	 String op = sc.next();
	    switch(op){
	    case "+" :
	    	System.out.println( a+b);
	    	break;
	    case "-" :
	    	System.out.println( a-b);
	    	break;
	    case "*" :
	    	System.out.println( a*b);
	    	break;
	    case "/" :
	    	if(b==0) {
	    		System.out.println("Division is not possible since b = 0..! ");
	    	}
	    	System.out.println( a/b);
	    	
	    		break;
	    case "%" :
	    	System.out.println( a%b);
	    	break;
	    case "abs" :
	    	System.out.println(Math.abs(a));
	    	System.out.println(Math.abs(b));
	    	break;
	    case "power" :
	    	System.out.println(Math.pow(a,b));
	    	break;
	    	
	    case "log" :
	    	System.out.println(Math.log(a)/Math.log(b));
	    	break;
	    	default:
	    		System.out.println("Invalid Operation");
	    }	
	    System.out.println("If you wish to exit then enter -1 if not press enter any other number");
        c = sc.nextInt(); 	    
	    } while(c != -1);
	    System.out.println("Calculator ends");
	    }  
    }



