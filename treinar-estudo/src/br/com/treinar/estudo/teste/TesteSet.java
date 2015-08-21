package br.com.treinar.estudo.teste;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteSet {

	public static void main(String args[]) {
		int count[] = { 34, 22, 10, 60, 30, 22 };
		Set<Integer> set = new HashSet<Integer>();
		try {
			for (int i = 0; i < 5; i++) {
				set.add(count[i]);
			}
			System.out.println(set);

			TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
			
			System.out.println("The sorted list is:");
			System.out.println(sortedSet);

			System.out.println("The First element of the set is: "
					+ (Integer) sortedSet.first());
			System.out.println("The last element of the set is: "
					+ (Integer) sortedSet.last());
		} catch (Exception e) {
		}
	}

}
