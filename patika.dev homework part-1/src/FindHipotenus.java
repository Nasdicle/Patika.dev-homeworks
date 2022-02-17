import java.util.Scanner;
public class FindHipotenus {
	
	
	
	    public static void main(String[] args) {
	        int edge1,edge2;
	        double hypotenuse;
	        Scanner input= new Scanner(System.in);
	        System.out.print("Type the first edge : ");
	        edge1=input.nextInt();
	        System.out.print("Type the second edge : ");
	        edge2=input.nextInt();
	        hypotenuse=Math.sqrt((edge1*edge1) + (edge2*edge2));
	        System.out.print("Length of hypotenuse: " + hypotenuse);



	    }
	}

