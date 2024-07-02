
public class TypeCastingDemo {

	public static void main(String[] args) {
		// Widening type casting/ Implicit type casting
		 byte b=10;
		 int i=b;
		 System.out.println(i);
		 
		 float f=22.45f;
		 double d=f;
		 System.out.println(d);
		 
		 char ch='A';
		 int no=ch;             //ASCII value is given as ans
		 System.out.println(no);
		 
		 char var1='\u00A7';
		 long l=var1;
		 System.out.println(l);
		 
		 char var2='\u00A7';
		 int l1=var2;
		 System.out.println(l1);
		 
		 // Narrowing- Explicit type casting
		 double d1=24.69853214d;
		 long l2=(long)d1;
		 System.out.println(l2);
		 float f2=(float)d1;
		 System.out.println(f2);
		 
		 long l4=576876899;
		 byte b1=(byte)l4;
		 System.out.println(b1);
		 int v1=(int)l4;
		 System.out.println(v1);
	}

}
