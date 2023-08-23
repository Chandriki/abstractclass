package chandriki2;

public class abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       S p=new S();
       p.show();
       p.print();
	}

}
abstract class A
{
	
	void print()
	{
		for(int i=0;i<7;i++)
	  System.out.println(i);
	}
	abstract void show();
}
class S extends A
{
	void show() {
		System.out.println("result");
	}
}