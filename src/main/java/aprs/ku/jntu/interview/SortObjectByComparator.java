package aprs.ku.jntu.interview;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortObjectByComparator {

	
	public static void main(String args[]){
		
		PrintStream b=null;
		Employee emp=new Employee();
		emp.setEmpname("zxc");
		emp.setEmpno(11);
		Object a=new Object();
		Employee emp1=new Employee();
		emp1.setEmpname("abv");
		emp1.setEmpno(2);
		List<Employee> all=new ArrayList<Employee>();
		all.add(emp);
		all.add(emp1);
		Collections.sort(all, new SortObjectComparator());
		//System.out.println(all.get(0).getEmpno()+"      -------->"+all.get(1).getEmpno());
		//System.out.println(all.get(0).getEmpname()+"      -------->"+all.get(1).getEmpname());
		System.out.println(emp1);
		
		
	}
}
