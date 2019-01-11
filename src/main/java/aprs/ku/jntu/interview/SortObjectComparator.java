package aprs.ku.jntu.interview;

import java.util.Comparator;

public class SortObjectComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
	//	return o1.empno-o2.empno;
		return o1.empname.compareTo(o2.empname);
	}

}
