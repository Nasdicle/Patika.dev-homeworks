import java.util.Scanner;

	public class GreengrocerProgram {
	
	
	    public static void main(String[] args) {
	        Scanner input=new Scanner(System.in);
	        double pine,apple,tomato,banana,aubergine,sum;
	        System.out.print("How many kilos of pine ? : ");
	        pine=input.nextDouble();
	        System.out.print("How many kilos of apple ? : ");
	        apple=input.nextDouble();
	        System.out.print("How many kilos of tomato ? : ");
	        tomato=input.nextDouble();
	        System.out.print("How many kilos of banana ? : ");
	        banana=input.nextDouble();
	        System.out.print("How many kilos of aubergine ? : ");
	        aubergine=input.nextDouble();
	        sum = (pine*2.14) + (apple*3.67) + (tomato*1.11) + (banana) + (aubergine*5);
	        System.out.print("Total price : " + sum);





	    }
	}

