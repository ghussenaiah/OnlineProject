package cse.testcases;

public class ConvertingStringToLowerCase {

	public static void main(String args[])
	{
		//String test="Heloo am Testing SomeTng";
		
		String test="SELECT student_1_01.name ,student_1_01.rollno ,marks_2_01.telugu  ,marks_2_01.hindi ,marks_2_01.eng  ,"
				+ "marks_2_01.maths ,marks_2_01.sci , marks_2_01.soc as \"soc\"   FROM student_1  student_1_01  "
						+ "LEFT join Marks_2 Marks_2_01 ON Student_1_01.marks_2id = Marks_2_01.id    limit 1";

		System.out.println(test.toLowerCase());
	}
}
