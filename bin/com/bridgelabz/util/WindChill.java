class WindChill
{
	public static void main(String args[])
	{
	   double Temperature=Double.parseDouble(args[0]);
	   double WindSpeed=Double.parseDouble(args[1]);


           double windchill=35.74+0.6215*Temperature+(0.4275*Temperature-35.75)*Math.pow(WindSpeed,0.16);
	   System.out.println("The entered temperature in Fahrenheit is"+Temperature+" \nThe entered wind speed is"+WindSpeed+"\nThe wind chill is"+windchill);	   
}
}		