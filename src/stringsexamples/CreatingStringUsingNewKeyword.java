package stringsexamples;

public class CreatingStringUsingNewKeyword {
	public static void main(String[] args) {

		// create a string using new
		String name = new String("Java String");

		System.out.println(name);  // print Java String
	}
}


//Methods of Java String
//Besides those mentioned above, there are various string methods present in Java. Here are some of those methods:
//
//	Methods	Description
//	contains()	checks whether the string contains a substring
//	substring()	returns the substring of the string
//	join()	join the given strings using the delimiter
//	replace()	replaces the specified old character with the specified new character
//	replaceAll()	replaces all substrings matching the regex pattern
//	replaceFirst()	replace the first matching substring
//	charAt()	returns the character present in the specified location
//	getBytes()	converts the string to an array of bytes
//	indexOf()	returns the position of the specified character in the string
//	compareTo()	compares two strings in the dictionary order
//	compareToIgnoreCase()	compares two strings ignoring case differences
//	trim()	removes any leading and trailing whitespaces
//	format()	returns a formatted string
//	split()	breaks the string into an array of strings
//	toLowerCase()	converts the string to lowercase
//	toUpperCase()	converts the string to uppercase
//	valueOf()	returns the string representation of the specified argument
//	toCharArray()	converts the string to a char array
//	matches()	checks whether the string matches the given regex
//	startsWith()	checks if the string begins with the given string
//	endsWith()	checks if the string ends with the given string
//	isEmpty()	checks whether a string is empty of not
//	intern() 	returns the canonical representation of the string
//	contentEquals()	checks whether the string is equal to charSequence
//	hashCode()	returns a hash code for the string
//	subSequence()	returns a subsequence from the string