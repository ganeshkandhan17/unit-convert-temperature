import java.util.*;
public class Unit_Converter{
    public static void main(String args[])
    {
        System.out.printf("1. Celsius to Fahrenheit\n");
        System.out.printf("2. Fahrenheit to Celsius\n");
        System.out.printf("3. Fahrenheit to Kelvin\n");
        System.out.printf("4. Celsius to Kelvin\n");
        System.out.printf("5. Kelvin to Celsius\n");
        System.out.printf("6. Kelvin to Fahrenheit\n");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value(1 to 6)= ")
        double n;
        n=in.nextInt();
        if(n==0 || n>6)
        {
         System.out.print("Invalid number entered")
         }
        else
        {
//------------------------------------------------------------------------------
                    // Celsius to Fahrenheit
        if(n==1)
        {
         System.out.print("Enter the value of Temperature(Celsius)= ");
         double Celsius=in.nextInt();
         if(Celsius==0)
         {
             System.out.print("Enter the valid value!!!");
         }
         else{
         System.out.print("Temperture ="+ CelsiustoFahrenheit(Celsius) + "F");
         }
        }
//---------------------------------------------------------------------------         
                    // Fahrenheit to Celsius
        else if(n==2)
        {
         System.out.print("Enter the value of Temperature(Fahrenheit= )");
         double Fahrenheit=in.nextInt();
          if(Fahrenheit==0)
         {
             System.out.print("Enter the valid value!!!");
         }
         else{
         System.out.print("Temperture ="+ FahrenheittoCelsius(Fahrenheit) + "C");
         }
        }
//------------------------------------------------------------------------------
                    // Fahrenheit  to Kelvin
        else if(n==3)
        {
         System.out.print("Enter the value of Temperature(Fahrenheit= )");
         double Fahrenheit=in.nextInt();
          if(Fahrenheit==0)
         {
             System.out.print("Enter the valid value!!!");
         }
         else{
         System.out.print("Temperture ="+ FahrenheittoKelvin(Fahrenheit) + "K");
         }
        }
//------------------------------------------------------------------------------
                    // Celsius to Kelvin
        else if(n==4)
        {
         System.out.print("Enter the value of Temperature(Celsius)= ");
         double Celsius=in.nextInt();
          if(Celsius==0)
         {
             System.out.print("Enter the valid value!!!");
         }
         else{
         System.out.print("Temperture ="+ CelsiustoKelvin(Celsius) + "K");
         }
        }
//-----------------------------------------------------------------------------
                    // Kelvin to Celsius
        else if(n==5)
        {
         System.out.print("Enter the value of Temperature(Kelvin)= ");
         double Kelvin=in.nextInt();
         if(Kelvin==0)
         {
             System.out.print("Enter the valid value!!!");
         }
         else{
         System.out.print("Temperture ="+ KelvintoCelsius(Kelvin) + "C");
         }
        }
//------------------------------------------------------------------------------
                   // Kelvin to Fahrenheit
        else if(n==6)
        {
         System.out.print("Enter the value of Temperature(Kelvin)= ");
         double Kelvin=in.nextInt();
         if(Kelvin==0)
         {
             System.out.print("Enter the valid value!!!");
         }
         else{
         System.out.print("Temperture ="+ KelvintoFahrenheit(Kelvin) + "F");
         }
        }
    }
  }
//------------------------------------------------------------------------------
                // Celsius to Fahrenheit
        public static double CelsiustoFahrenheit(double Celsius)
        {
            return (Celsius * 9/5) + 32;
        }
//------------------------------------------------------------------------------
                  //  Fahrenheit to Celsius
        public static double FahrenheittoCelsius(double Fahrenheit)
        {
            return (Fahrenheit * 9/5) - 32;
        }
//------------------------------------------------------------------------------
                // Fahrenheit to Kelvin
        public static double FahrenheittoKelvin(double Fahrenheit)
        {
            return 273.5 + ((Fahrenheit - 32.0) * (5.0/9.0));
        }
//------------------------------------------------------------------------------
                // Celsius to Kelvin
        public static double CelsiustoKelvin(double Celsius)
        {
            return Celsius+273;
        }
//------------------------------------------------------------------------------
                // Kelvin to Celsius
        public static double KelvintoCelsius(double Kelvin)
        {
            return Kelvin-273;
        }
//------------------------------------------------------------------------------
                // Kelvin to Fahrenheit
        public static double KelvintoFahrenheit(double Kelvin)
        {
            return 1.8*(Kelvin-273) + 32;
        }
}

