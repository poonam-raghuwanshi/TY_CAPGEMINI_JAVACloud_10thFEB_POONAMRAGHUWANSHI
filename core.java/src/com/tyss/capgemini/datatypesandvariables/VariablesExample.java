package com.tyss.capgemini.datatypesandvariables;

public class VariablesExample {
	//GLOBAL VARIABLE
	static byte sGbyte;
	static short sGshort;
	static int sGint;
	static long sGlong;
	static float sGfloat;
	static double sGdouble;
	static char sGchar;
	static boolean sGisTrue;
	static boolean sGString;
	
@SuppressWarnings("unused") //for unused variable we can use this warning
	public static void main(String[] args) {
		//LOCAL-VARIABLE 
		  byte lbyte; 
		  short lshort;
		  int lint; 
		  long llong; 
		  float lfloat; 
		  double ldouble;
		  char lchar; 
		  boolean lisTrue;
		  String lString;  
		 

		System.out.println(sGbyte);
		System.out.println(sGshort);
		System.out.println(sGint);
		System.out.println(sGlong);
		System.out.println(sGfloat);
		System.out.println(sGdouble);
		System.out.println(sGchar);
		System.out.println(sGisTrue);
		System.out.println(sGString);

		
		/* LOCAL VARIABLE MUST BE INITIALIZE BEFORE WE CAN 
		 * System.out.println(lbyte); System.out.println(lshort);
		 * System.out.println(lint); System.out.println(llong);
		 * System.out.println(lfloat); System.out.println(ldouble);
		 * System.out.println(lchar); System.out.println(lisTrue);
		 * System.out.println(lString);
		 */

		
		
	}

}
