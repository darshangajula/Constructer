class Car
{
	String name;
	String colour;
	//constructer
	Car(String n,String c) //declaration and initialization of Constructer
	{
		System.out.println("enter your option");
		name=n;
		colour=c;

	}
	public static void main(String[] args) {

		Car car1 =new Car("Audi","Red"); // giving arguments into the constructer
		System.out.println(car1.name); //
		System.out.println(car1.colour);
	}
}