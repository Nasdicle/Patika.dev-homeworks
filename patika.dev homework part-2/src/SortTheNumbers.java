package MyJavaPatika.devHomeworks;

import java.util.Scanner;

public class SortTheNumbers {

	public static void main(String[] args) {
		double a, b, c ;
        Scanner input = new Scanner(System.in);

        System.out.print("Please write the first number : ");
        a = input.nextDouble();

        System.out.print("Please write the second number : ");
        b = input.nextDouble();

        System.out.print("Please write the third number : ");
        c = input.nextDouble();

        if((a > b && a > c)) {
            if (b > c) {
                System.out.println("a > b > c");
            } else {
                System.out.println("a > c > b");
            }
        } else if ((b > a && b > c)){
            if (a > c){
                System.out.println("b > a > c");
            }else{
                System.out.println("b > c > a");
            }
        } else if((c > a && c > b)){
            if (a > b){
                System.out.println("c > a > b");
            }else{
                System.out.println("c > b > a");
            }
        }
		
		}
		

	}


