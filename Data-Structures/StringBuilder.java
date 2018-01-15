/*
Implementation of java.lang.StringBuilder using java.util.ArrayList
Based on StringBuilder documentation: https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html
*/

import java.util.*;
import java.io.*;

class StringBuilder {

	public List<Character> stringBuilder = new ArrayList<Character>();

	//Constructs a string builder initialized to the contents of the specified string.
	public StringBuilder(String str) {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			this.stringBuilder.add(c);
		}
	}

	//Appends the specified string to this character sequence.
	public void append(String str) {
		char[] toAppend = str.toCharArray();
		for (int i = 0; i < toAppend.length; i++) {
			this.stringBuilder.add(toAppend[i]);
		}
	}

	//Returns the current capacity.
	public int capacity() {
		return this.stringBuilder.size();
	}

	//Removes the characters in a substring of this sequence.
	public void delete(int start, int end) {
		for (int i = start; i <= end; i++) {
			this.stringBuilder.remove(i);
		}
	}

	//Removes the char at the specified position in this sequence.
	public void deleteCharAt(int index) {
		this.stringBuilder.remove(index);
	}

	//Inserts the string representation of the second int argument into this sequence.
	public void insert(int offset, String str) {
		for (int i = 0; i < str.length(); i++, offset++) {
			char c = str.charAt(i);
			this.stringBuilder.add(offset, c);
		}
	}

	//Returns the length (character count).
	public int length() {
		return this.stringBuilder.size();
	}

	//Replaces the characters in a substring of this sequence with characters in the specified String.
	public void replace(int start, int end, String str) {
		int j = 0;
		char[] toReplace = str.toCharArray();
		for (int i = start; i < end; i++) {
			this.stringBuilder.remove(i);
			this.stringBuilder.add(i, toReplace[j]);
			j++;
		}
	}

	//Causes this character sequence to be replaced by the reverse of the sequence.
	public void	reverse() {
		int size = this.stringBuilder.size();
		for (int i = 0; i < size / 2; i++) {
			char a = this.stringBuilder.get(i);
			this.stringBuilder.remove(i);
			this.stringBuilder.add(i, this.stringBuilder.get(size-2-i));
			this.stringBuilder.remove(size-1-i);
			this.stringBuilder.add(size-1-i, a);
		} 
	}

	//Returns a string representing the data in this sequence.
	public String toString() {
		return this.stringBuilder.toString().replaceAll("[,\\s\\[\\]]", "");
	}

	public static void main(String[] args) {
		//Create new StringBuilder object
		String example = "";
		StringBuilder stringBuilder = new StringBuilder(example);

		//Append "pug"
		stringBuilder.append("p");
		stringBuilder.append("u");
		stringBuilder.append("g");
		System.out.println(stringBuilder.toString());

		System.out.println("StringBuilder length: " + stringBuilder.length());

		stringBuilder.reverse();
		System.out.println(stringBuilder.toString());

		stringBuilder.replace(0, 1, "b");
		stringBuilder.replace(2, 3, "g");
		System.out.println(stringBuilder.toString());
	}
}