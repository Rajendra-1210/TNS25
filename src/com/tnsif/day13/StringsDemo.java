package com.tnsif.day13;

public class StringsDemo {

	public static void main(String[] args) {
		String s="Reva";
		String s1=new String("REVA............bangalore");
		System.out.println("comparision using ==" +s==s1);
		System.out.println("comparision using equals" +s.equals(s1));
		System.out.println("comparision using compareTO" +s.compareTo(s1));
		System.out.println("comparision using length " +s.length());
		System.out.println("comparision using uppercase" +s.toUpperCase());
		System.out.println("comparision using lowercase" +s.toLowerCase());
		


	}

}
