package com.basic.java;

public class StringDemo {

	public static void main(String[] args) {

		String s1 = "Harshal";
		System.out.println(s1);
		System.out.println("The character at 2nd index is : " + s1.charAt(2));
		System.out.println("The index of character l is : " + s1.indexOf('l'));
		System.out.println("The hashcode of string is :" + s1.hashCode());
		System.out.println("The legth of string is :" + s1.length());
		System.out.println(s1.startsWith("H")); // true or false
		System.out.println(s1.endsWith("all")); // false

		String s2 = new String(" Deshpande");
		System.out.println(s2);
		String s3 = "Harshal";

		// to upper,contains,equals
		System.out.println(s1.equalsIgnoreCase(s3)); // true
		System.out.println(s1.contains("shal"));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());

		// concat
		System.out.println(s1.concat(s2));

		// trimming the spaces (trailing)
		System.out.println(s2.trim());

		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s3.trim().toLowerCase()));
		
		//Splitting 
		String name = "Harshal Deshpande";
		System.out.println(name);
		
		String str[] = name.split(" ");
		System.out.println(str[0]);
		System.out.println(str[1]);
		
		for(int i =0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
	
		//substring
		
		String str1 = "Harshu";
		System.out.println(str1.substring(1, 4)); //from start to end
		System.out.println(str1.substring(3));
		
		//replace
		
		System.out.println(str1.replace("H", "A"));
		System.out.println(s1);
		
		
		
		
		
	}
	

}
