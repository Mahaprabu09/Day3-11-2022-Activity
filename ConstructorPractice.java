package Day3M11Y2022Activity;

public class ConstructorPractice {
	int rollno;
	String name;
	ConstructorPractice(int a,String b)
	{
		this.rollno=a;
		this.name=b;
	}
	
	void display()
	{
		System.out.println(rollno+" "+name);
	}
	
	public static void main(String[]args)
	{
		ConstructorPractice cp=new ConstructorPractice(11,"Mahaprabu");
		cp.display();
		ConstructorPractice cp1=new ConstructorPractice(12,"prabu");
		cp1.display();
		ConstructorPractice cp2=new ConstructorPractice(13,"Ranjith");
		cp2.display();
		ConstructorPractice cp3=new ConstructorPractice(14,"salmon");
		cp3.display();
		ConstructorPractice cp4=new ConstructorPractice(34,"Mahaprabu");
		cp4.display();
			
	}
}
