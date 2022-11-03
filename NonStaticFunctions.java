package Day3M11Y2022Activity;

public class NonStaticFunctions {
	int a=40;
	int b=50;
	int c=34;
	//Non-static block
	{
		System.out.println("Non-static method");
	}
	NonStaticFunctions(int x)//Contructor with parameter
	{
        this.a=x;
        System.out.println(a);
		System.out.println("Contructor with arguments");
	}
	NonStaticFunctions()// Contructor without parameter
	{
		System.out.println("Contructor without arguments");
	}
	
	public static void main(String[]args)
	{
		NonStaticFunctions ns=new NonStaticFunctions(34);
		NonStaticFunctions ns1=new NonStaticFunctions();
		NonStaticFunctions ns2=new NonStaticFunctions();
		System.out.println(ns2.a
				+"\n"+ns2.b
				+"\n"+ns2.c);
	}

}
