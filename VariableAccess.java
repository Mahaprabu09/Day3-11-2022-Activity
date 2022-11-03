package Day3M11Y2022Activity;

public class VariableAccess {
	static int x=34;
	int y=12;
	
	public static void main(String[]args)
	{
		VariableAccess va=new VariableAccess();
		VariableAccess va1=new VariableAccess();
		VariableAccess va2=null;
		System.out.println(x);      //Direct Static variable access
		System.out.println(va.x);   //Through Object Static variable access
		System.out.println(VariableAccess.x);   //Static Variable access by Classname
		
	//	System.out.println(va2.y);  //NullpointerException
		
	}
	

}
