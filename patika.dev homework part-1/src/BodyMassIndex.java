import java.util.Scanner;

	public class BodyMassIndex {
	/**
	 * @author ahmetoztrk
	 */
	
	    public static void main(String[] args) {
	        Scanner input= new Scanner(System.in);
	        double weight,height,bmi ;
	        System.out.print("Please enter your weight(kg) : ");
	        weight = input.nextDouble();
	        System.out.print("Please enter your height(m) : ");
	        height = input.nextDouble();
	        bmi = weight / (height*height);
	        System.out.println("Body Mass Index : " + bmi);
	    }
	}
	
