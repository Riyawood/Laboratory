package arrayexample;

public class StringDemo
{
	public static void main(String[] args) {
		/*
		 * char[] ch={'s','a','i','p','r','i','y','a'}; 
		 * String s=new String(ch);
		 * System.out.println(ch);
		 * 
		 * // String name="saipriya"; 
		 * // System.out.println(name);
		 * 
		 * //concept of String literal //we mainly use it to save memory so that new
		 * memories are not created //for the same string 
		 * String name="Rahul"; 
		 * String name1="Rahul"; //it doesn't create a new instance
		 * System.out.println(name==name1); 
		 * String str = " Dutta";
		 * System.out.println(name==str); //returns false as both of them are different
		 * name = name.concat(str); //joins the string
		 * System.out.println(name.length()); //Rahul Dutta
		 * 
		 * String msg = "Good morning";
		 * 
		 * char c = msg.charAt(0); //0--> index System.out.println(c);
		 * 
		 * String s1 = new String("Amrita"); //65 
		 * String s2 = new String("Amrita"); //65
		 * String s3 = new String("Lokesh"); //76 
		 * String s4 = new String("Pritam"); //80
		 * String s5 = new String("Priya");
		 *  System.out.println(s1.compareTo(s2)); //0
		 * System.out.println(s1.compareTo(s3)); //65<76 -->negative no. -11
		 * System.out.println(s4.compareTo(s3)); //80>76 -->positive no. 4
		 * System.out.println(s4.compareTo(s5));
		 * 
		 * String a = "Hello Java"; 
		 * System.out.println(a.contains("Java")); //return true or false 
		 * System.out.println(a.endsWith("e")); //returns true or false
		 */		
		
		// Student stu1 = new Student(1,"Rahul","Dutta"); //rollno, firstName, lastName
		// Student stu2 = new Student(2, "Rahul", "Das");
		
		//String Builder
		
//		  StringBuilder builder = new StringBuilder("Hello world"); //mutable
//		  builder.append(" i am learning JAVA"); //append is used to join strings
//		  System.out.println(builder); 
//		  builder.insert(11, ",");
//		  System.out.println(builder); 
//		  builder.replace(13, 17, "I love");
//		  System.out.println(builder); 
//		  builder.reverse(); //reversing a string
//		  System.out.println(builder); 
//		  StringBuilder hello = new StringBuilder("Hello"); 
//		  hello.delete(1, 3); System.out.println(hello);
		 
		
		
		//String Buffer
		StringBuffer buffer = new StringBuffer("hello"); //default capacity -> 16
		System.out.println(buffer.capacity()); //-->capacity- 16+5 = 21
		buffer.append(" java i love programming"); //(old capacity*2)+2 ->(21*2)+2 =42+2 =44
		System.out.println(buffer);
		System.out.println(buffer.capacity());
		buffer.insert(10, ",");
		System.out.println(buffer);
		System.out.println(buffer.indexOf("love")); //index of the word
		//substring can be done in two ways
		System.out.println(buffer.substring(14)); //start index
		System.out.println(buffer.substring(6, 10)); //start and end index
		buffer.delete(6, 10);
		System.out.println(buffer);
	}
}
