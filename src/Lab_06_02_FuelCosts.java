import java.util.Scanner;

public class Lab_06_02_FuelCosts {
    public Lab_06_02_FuelCosts(){
    }
    public static void main (String[]args){
        double gallonsInTank = 0 ;
        double milesToGallon = 0;
        double pricePerGallon = 0;
        double pricePer100miles = 0;
        double howFarCanItGo = 0;
        String trash;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of gallons of gas in the tank: ");

        if(in.hasNextDouble()) {
            gallonsInTank = in.nextDouble();
            in.nextLine();

            System.out.println("Enter the fuel efficiency in miles per gallon: ");

            if(in.hasNextDouble()){
                milesToGallon = in.nextDouble();
                in.nextLine();

                System.out.println("Enter the price of gas per gallon: ");

                if(in.hasNextDouble()){
                    pricePerGallon = in.nextDouble();
                    in.nextLine();

                    pricePer100miles = 100 / milesToGallon * pricePerGallon;
                    howFarCanItGo = gallonsInTank * milesToGallon;

                    System.out.println("The cost per 100 miles is " + pricePer100miles);
                    System.out.println("You can go " + howFarCanItGo + " miles, with the gas in the tank.");




                }else{
                    trash = in.nextLine();
                    System.out.println("You entered an invalid value: " + trash);
                }



            }else{
                trash = in.nextLine();
                System.out.println("You entered an invalid value: " + trash);
            }

        } else {
            trash = in.nextLine();
            System.out.println("You entered an invalid value: " + trash);
        }


    }
}
