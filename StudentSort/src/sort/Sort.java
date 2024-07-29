package sort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Sort {

	public static void sort(List<Student> array, Comparator<Student> cmp) {
		int n = array.size();
		for (int i = 0; i < n; i++) {
			int index = i;
			Student min = array.get(i);
			for (int j = i + 1; j < n; j++) {
				if (cmp.compare(array.get(j), array.get(index)) < 0) {
					index = j;
					min = array.get(j);
				}
			}

			Student t = array.get(index);
			array.set(index, array.get(i));
			array.set(i, t);

		}

	}

	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<Student>();

		students.add(new Student(" Ash Ketchum ", 1020, " 546 Pallet Town"));
		students.add(new Student(" Misty Williams ", 1061, " 498 Misty Lane"));
		students.add(new Student(" Cynthia Garchomp ", 1012, " 989 Sinnoh Lane"));
		students.add(new Student(" Gary Oak ", 2003, " 550 Pallet Town"));
		students.add(new Student(" Jessie Rocket ", 3004, " 690 Rocket Lane"));
		students.add(new Student(" James Rocket ", 1005, " 670 Rocket Lane"));
		students.add(new Student(" Lorelai Blizzard ", 1006, "300 Kanto Lane"));
		students.add(new Student(" Agatha Ghost ", 1007, " 400 Kanto Lane"));
		students.add(new Student(" Flannery Fire ", 1008, " 775 Lavaridge Street"));
		students.add(new Student(" Karen Umbreon ", 1030, " 800 Indigo Lane"));

		Sort.sort(students, new comparatorrollNo());
		Iterator itr = students.iterator();
		System.out.println("=================================================");
		System.out.println("Here are your list of students sorted by rollNo: ");
		System.out.println("=================================================");
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.rollNo + "" + st.name + st.address);
		}
		Sort.sort(students, new comparatorName());
		Iterator itr1 = students.iterator();
		System.out.println("=================================================");
		System.out.println("Here are your list of students sorted by Name : ");
		System.out.println("=================================================");
		while (itr1.hasNext()) {
			Student st = (Student) itr1.next();
			System.out.println(st.rollNo + "" + st.name + st.address);
		}

	}
}
