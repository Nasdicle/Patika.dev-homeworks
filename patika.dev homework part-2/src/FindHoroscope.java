package MyJavaPatika.devHomeworks;

import java.util.Scanner ;
public class FindHoroscope {
    public static void main(String[] args) {

        int month, day ;
        Scanner input = new Scanner(System.in);

        System.out.print("Please write the month you were born (like January = 1) : ");
        month = input.nextInt();

        System.out.print("Please write the day you were born : ");
        day = input.nextInt();

        switch (month){
            case 1 :
                if (day >= 1 && day <= 31){
                    if (day <= 21){
                        System.out.println("Your horoscope is Capricorn.");
                    } else {
                        System.out.println("Your horoscope is Aquarius.");
                    }
                } else {
                    System.out.println("You wrote an invalid day.");
            }

                break;

            case 2 :
                if (day >= 1 && day <= 28){
                    if (day <= 19){
                        System.out.println("Your horoscope is Aquarius.");
                    } else {
                        System.out.println("Your horoscope is Pisces ");
                    }
                } else {
                    System.out.println("You wrote an invalid day.");
                }

                break;

            case 3 :
                if (day >= 1 && day <= 31){
                    if (day <= 20){
                        System.out.println("Your horoscope is Pisces.");
                    } else {
                        System.out.println("Your horoscope is Aries.");
                    }
                } else {
                    System.out.println("You wrote an invalid day.");
                }

                break;

            case 4 :
                if (day >= 1 && day<= 30){
                    if (day <= 20){
                        System.out.println("Your horoscope is Aries.");
                    } else {
                        System.out.println("Your horoscope is Taurus.");
                    }
                } else {
                    System.out.println("You wrote an invalid day.");
                }

                break;

            case 5 :
                if (day >= 1 && day <= 31){
                    if (day <= 21){
                        System.out.println("Your horoscope is Taurus.");
                    }else{
                        System.out.println("Your horoscope is Gemini.");
                    }
                }else{
                    System.out.println("You wrote an invalid day.");
                }

                break;

            case 6 :
                if (day >=1 && day <= 30){
                    if (day <= 22){
                        System.out.println("Your horoscope is Gemini.");
                    }else{
                        System.out.println("Your horoscope is Cancer.");
                    }
                }else{
                    System.out.println("You wrote an invalid day.");
                }

                break;

            case 7 :
                if (day >= 1 && day <= 31){
                    if (day <= 22){
                        System.out.println("Your horoscope is Cancer.");
                    }else{
                        System.out.println("Your horoscope is Leo.");
                    }
                }else{
                    System.out.println("You wrote an invalid day");
                }

                break;

            case 8 :
                if (day >= 1 && day <= 31){
                    if (day <= 22){
                        System.out.println("Your horoscope is Leo.");
                    }else{
                        System.out.println("Your horoscope is Virgo.");
                    }
                }else{
                    System.out.println("You wrote an invalid day.");
                }

                break;

            case 9 :
                if (day >= 1 && day <= 30){
                    if (day <= 22){
                        System.out.println("Your horoscope is Virgo.");
                    }else{
                        System.out.println("Your horoscope is Libra.");
                    }
                }else{
                    System.out.println("You wrote an invalid day.");
                }

                break;

            case 10 :
                if (day >= 1 && day <= 31){
                    if (day <= 22){
                        System.out.println("Your horoscope is Libra.");
                    }else{
                        System.out.println("Your horoscope is Scorpio.");
                    }
                }else{
                    System.out.println("You wrote an invalid day.");
                }

                break;

            case 11 :
                if (day >= 1 && day <= 30){
                    if (day <= 21){
                        System.out.println("Your horoscope is Scorpio.");
                    }else{
                        System.out.println("Your horoscope is Sagittarius.");
                    }
                }else{
                    System.out.println("You wrote an invalid day.");
                }

                break;

            case 12 :
                if (day >= 1 && day <= 31){
                    if (day <= 21){
                        System.out.println("Your horoscope is Sagittarius.");
                    }else{
                        System.out.println("Your horoscope is Capricorn.");
                    }
                }else{
                    System.out.println("You wrote an invalid day.");
                }

                break;

        }
    }

}
