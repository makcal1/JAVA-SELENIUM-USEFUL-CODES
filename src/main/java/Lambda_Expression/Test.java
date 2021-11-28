package Lambda_Expression;

@FunctionalInterface
interface FlightAppointment
{
	public String booking(String source,String destination);
}
public class Test {
	
	public static String functionalMethod (String src,String dst)
	{
		FlightAppointment flightAppointment = (source,destination)->{
			return "Mami's flight is booked from " + source + " To " + destination;
		};
		return flightAppointment.booking(src,dst);
	}
	
	
	public static void main(String[] args)
	{
	
		System.out.println(functionalMethod("Warsaw","Istanbul"));	// Mami's flight is booked from Warsaw To Istanbul
	
	}}