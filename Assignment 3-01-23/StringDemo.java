package arrayexample;

public class StringDemo
{
	public static void main(String[] args)
  {
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
