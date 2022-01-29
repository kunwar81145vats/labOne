/*
Student Name: Kunwar Vats
Student Number: A00251176
Program Description: This program converts imperial units to metric units
and vice versa for the given 5 units
km to/from mi,
cm to/from in,
g to/from oz,
c to/from k,
cups to/from l,

User can enter input as : 5 km or 5km
*/

import java.util.Scanner;

class Convert {
    public static void main(String[] args) {

      System.out.println("Enter a value with unit to convert or type 'q' to exit program.");
      getUserInput();
    }

    //Method used to get User input
    static void getUserInput() {

      Scanner sc= new Scanner(System.in);
      String strInput = sc.nextLine();
      if (strInput.contains("cups"))
      {
        Double val = returnFloatFromString(strInput, "cups");
        Double convertedVal = val * 0.24;
        System.out.println(val + " cups is equal to " + convertedVal+ " L");
        endOfConversion();
        return;
      }
      else if (strInput.toLowerCase().contains("l")){
        Double val = returnFloatFromString(strInput, "l");
        Double convertedVal = val * 4.23;
        System.out.println(val + " L is equal to " + convertedVal+ " cups");
        endOfConversion();
        return;
      }
      else if (strInput.toLowerCase().contains("km")){
        Double val = returnFloatFromString(strInput, "km");
        Double convertedVal = val * 0.6;
        System.out.println(val + " km is equal to " + convertedVal+ " mi");
        endOfConversion();
        return;
      }
      else if (strInput.toLowerCase().contains("mi")){
        Double val = returnFloatFromString(strInput, "mi");
        Double convertedVal = val * 1.6;
        System.out.println(val + " mi is equal to " + convertedVal+ " km");
        endOfConversion();
        return;
      }
      else if (strInput.toLowerCase().contains("cm")){
        Double val = returnFloatFromString(strInput, "cm");
        Double convertedVal = val * 0.39;
        System.out.println(val + " cm is equal to " + convertedVal+ " in");
        endOfConversion();
        return;
      }
      else if (strInput.toLowerCase().contains("in")){
        Double val = returnFloatFromString(strInput, "in");
        Double convertedVal = val * 2.54;
        System.out.println(val + " in is equal to " + convertedVal+ " cm");
        endOfConversion();
        return;
      }
      else if (strInput.toLowerCase().contains("g")){
        Double val = returnFloatFromString(strInput, "g");
        Double convertedVal = val * 0.04;
        System.out.println(val + " g is equal to " + convertedVal+ " oz");
        endOfConversion();
        return;
      }
      else if (strInput.toLowerCase().contains("oz")){
        Double val = returnFloatFromString(strInput, "oz");
        Double convertedVal = val * 28.35;
        System.out.println(val + " oz is equal to " + convertedVal+ " g");
        endOfConversion();
        return;
      }
      else if (strInput.toLowerCase().contains("c")){
        Double val = returnFloatFromString(strInput, "c");
        Double convertedVal = val + 273.15;
        System.out.println(val + " c is equal to " + convertedVal+ " k");
        endOfConversion();
        return;
      }
      else if (strInput.toLowerCase().contains("k")){
        Double val = returnFloatFromString(strInput, "k");
        Double convertedVal = val - 273.15;
        System.out.println(val + " k is equal to " + convertedVal+ " c");
        endOfConversion();
        return;
      }
      else if (strInput.equalsIgnoreCase("q")){
        System.exit(0);
      }
      else
      {
        System.out.println("Invalid input please try again");
        getUserInput();
      }
    }

    //Method called at the end of every conversion to
    //prompt user to enter new value or quit
    static void endOfConversion()
    {
      System.out.println("Enter a value with unit to convert or type 'q' to exit program.");
      getUserInput();
    }

    //Method used to get actual value from user input
    static Double returnFloatFromString(String strValue, String strUnit)
    {
      String val = strValue.toLowerCase().replace(strUnit, "");
      String finalVal = val.replace(" ", "");
      Double actualVal = 0.0;

      try
       {
         actualVal = Double.valueOf(finalVal);
       } catch(Exception e){
         System.out.println("Invalid input Please try again");
         getUserInput();
       }

      return actualVal;
    }
}
