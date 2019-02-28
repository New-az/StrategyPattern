
public class ComparatorString implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		String i = (String) o1;
		String j = (String) o2;
		return i.compareTo(j);
	}
}
