
public class Main {

	public static void main(String[] args) {
		Object[] setInt = { 1, 40, 32, 0, 53, 22 };
		Object[] setString = { "B", "A", "D", "C" };

		Comparator cmpInt = new ComparatorInt();
		Comparator cmpString = new ComparatorString();

		Sort s = new Sort();
		s.sort(setInt, cmpInt);

		for (Object x : setInt) {
			System.out.println(x);
		}
		
		s.sort(setString, cmpString);

		for (Object x : setString) {
			System.out.println(x);
		}
	}

}
