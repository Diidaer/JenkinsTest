package test;
import org.apache.commons.math3.util.MyLinkedList;

public class testMyLinkedList {
	public static void main(String[] args) {
		testMyLinkedList myTest = new testMyLinkedList();
		myTest.testCompareTo();
	}
	
	public void testCompareTo() {
		Double x = new Double(1.08);
		Double y = new Double(5.17);
		Double eps = new Double(0.314);
		int n;
		n = MyLinkedList.compareTo(x, y, eps);
		if(-1 == n) {
			System.out.println("OK!");
		}
		else {
			System.err.println("Error in Cmp()!");
		}
	}
}
