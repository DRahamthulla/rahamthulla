package casting;

class ImplicitCasting {

	public static void main(String[] args) {
		byte b=12;
	 System.out.println("byte value:"+b);
	 short s=b;
	 System.out.println("short value:"+s);
	 long l=b;
	 System.out.println("long value:"+l);
	 float f=l;
	 System.out.println("float value:"+f);
	 double d=f;
	 System.out.println("double value:"+d);
	 double o=100.4;
	 System.out.println("double value:"+o);
	 //expilictCasting
	long k=(long)o;
	System.out.println("long value:"+k);
	int h=(int)k;
	System.out.println("int value:"+h);
	}
}



