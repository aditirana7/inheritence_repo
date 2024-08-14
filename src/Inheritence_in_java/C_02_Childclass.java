package Inheritence_in_java;

public class C_02_Childclass extends C_01_baseclass {
	public void mul()
	{
		System.out.println("Multiplication");
	}
	public void div()
	{
		System.out.println("Division");
	}
	public static void main(String args[])
	{
		C_02_Childclass obj1=new C_02_Childclass();
		obj1.add();
		obj1.sub();
		obj1.mul();
		obj1.div();
		System.out.println("==================");
		C_01_baseclass obj2=new C_01_baseclass();
		obj2.add();
		obj2.sub();
		System.out.println("========================");
		
	}
}
