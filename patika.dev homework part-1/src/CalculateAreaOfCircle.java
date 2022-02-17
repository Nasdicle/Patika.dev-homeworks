import java.util.Scanner;

public class CalculateAreaOfCircle {
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        double r;
	        System.out.print("Please type 'r': ");
	        r=input.nextInt();
	        double area;
	        area= r*r*3.14;
	        double circumference;
	        circumference=r*3.14*2;
	        System.out.println("Area of circle : " + area);
	        System.out.println("Circumference of circle : " + circumference);

	    }
	}

