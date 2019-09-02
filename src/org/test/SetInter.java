package org.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInter {

	public static void main(String[] args) {
		Set<Character> c=new HashSet<>();
		c.add('a');
		c.add('A');
		c.add('1');
		c.add('&');
		c.add(' ');
		System.out.println(c);
		Set<Character> d=new LinkedHashSet<>();
		d.add('A');
		d.add('a');
		d.add('E');
		d.add('t');
		System.out.println(d);
		Set<Character> e=new TreeSet();
		e.addAll(c);
		System.out.println(e);
		
		
	}

}
