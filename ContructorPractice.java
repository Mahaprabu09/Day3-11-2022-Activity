package Day3M11Y2022Activity;

public class ContructorPractice {
	int rollno;
	String name;
	ContructorPractice(int a,String b)
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
		ContructorPractice cp=new ContructorPractice(11,"Mahaprabu");
		cp.display();
		ContructorPractice cp1=new ContructorPractice(12,"prabu");
		cp1.display();
		ContructorPractice cp2=new ContructorPractice(13,"Ranjith");
		cp2.display();
		ContructorPractice cp3=new ContructorPractice(14,"salmon");
		cp3.display();
		ContructorPractice cp4=new ContructorPractice(34,"Mahaprabu");
		cp4.display();
		
		
	}
	

}
