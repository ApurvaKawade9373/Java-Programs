
public class DataTypes {

	public static void main(String[] args) {
	 int value=1;
	 int value1=9/2;
	 float value2=9f/2f;
	 float value3=5/5.23f;
	 double value4=937301015/2d;
	 
	 System.out.println("Value =" + value);
	 System.out.println("Value 1=" + value1);
	 System.out.println("Value 2=" + value2);
	 System.out.println("Value 3=" + value3);
	 System.out.println("Value 4=" + value4);
	 
	 int marker=512;
	 double percentage=marker*0.46f+56;
	 System.out.println("Percentage is:" + percentage);
	 
	 //byte takes 1 byte=8 bits
	 byte byteMax=127;
	 byte byteMin=-128;
	  System.out.println("Minimum range of byte is: " +byteMin+ "  Max range of byte is: " +byteMax);
	  
	  //short -2 bytes
	 short shortMax=32767;
	 short shortMin=-32767;
	 System.out.println("Minimum range of short is: " +shortMin+ "  Max range of short is: " +shortMax);
	 
	 //Long- 8bytes
	 long longMax=9223372036854775807L;
	 long longMin=-9223372036854775807L;
	 System.out.println("Minimum range of Long is: " +longMin+ "  Max range of long is: " +longMax);
	}

}
