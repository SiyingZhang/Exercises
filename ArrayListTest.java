import java.util.List;
import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();

		l.add(0);
		l.add(1);
		l.add(2);
		l.add(3);

		List<Integer> subL = l.subList(0, 2);

		for(int i:subL) {
			System.out.println(i);
		}
	}

}