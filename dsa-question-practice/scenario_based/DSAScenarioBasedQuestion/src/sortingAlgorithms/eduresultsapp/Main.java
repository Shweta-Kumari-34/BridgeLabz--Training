/*
 * EduResults – Rank Sheet Generator (Merge Sort)
Story: An educational board compiles marks of thousands of students from different districts.
Each district submits a sorted list of students by score. The main server needs to merge and
sort all these lists into a final state-wise rank list. Merge Sort ensures efficiency and maintains
stability for duplicate scores.
Concepts Involved:
● Merge Sort
● Merging sorted sublists
● Large datasets with stable sorting
 */

package sortingAlgorithms.eduresultsapp;
import java.util.*;

public class Main {
public static void main(String [] args) {
	Scanner input= new Scanner(System.in);
	System.out.println("********Welcome To EduResultsApp*********");

	Student[] list= {
			new Student(450, "Aarav Sharma"  ) ,
			new Student(467, "Riya Gupta" ),
			new Student(389, "Ananya Verma" ),
			new Student(440, "Rohan Gupta"),
			new Student( 399, "Kunal Singh"),
			new Student( 419, "Neha Kapoor" ),
			new Student( 485, "Aman Patel" ),
			new Student( 494, "Sanya Malhotra"),
	};
	
	MergeSort.printRankList( list, "Rank List Before Sorting ");
	MergeSort.mergeSort( list, 0, list.length-1);
	
    MergeSort.printRankList( list, "Rank List After Sorting ");
	System.out.println("********Thank You !!!*********");
	System.out.println("********Visit Again*********");
	

}
}
