
public class ComparatorInt implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		int i = (Integer) o1;
		int j = (Integer) o2;
		if(i < j) return -1;
		else if (i > j) return 1;
		else return 0;
	}
}
