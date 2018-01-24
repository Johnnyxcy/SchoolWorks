import java.util.Iterator;

public class TestMyAVL {
	public static void main(String args[]) {
		StringTree case1 = new AVLTree();
//		case1.insert("13", "");
//		case1.insert("17", "");
//		case1.insert("14", "");
//		case1.insert("19", "");
//		case1.insert("22", "");
//		case1.insert("18", "");
//		case1.insert("11", "");
//		case1.insert("10", "");
//		case1.insert("21", "");
		case1.insert("10", "");
		case1.insert("06", "");
		case1.insert("11", "");
		case1.insert("09", "");
		case1.insert("07", "");
		case1.insert("08", "");
		System.out.println("The size is " + case1.size());
		Iterator<String> it = case1.getBFSIterator();
		System.out.print(it.next());
		while(it.hasNext()) {
			System.out.print(", "+ it.next());
		}
		System.out.println();
		System.out.println(AVLTester.verifyAVL(case1));
	}
}