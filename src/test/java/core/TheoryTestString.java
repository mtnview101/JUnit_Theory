package core;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.is; // why "is" is striked?

import org.junit.Assume;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TheoryTestString {
	int i=0;
	@DataPoints
	public static String[] s_array(){
		return new String[] {"1","2","3","4","5","6","7","8","9"};}
	//return new String[] {"1","2","3","4","5"};}
	
	@Theory
	public void a(String first1,String first2,String first3,String first4,String first5,String first6,String first7,String first8,String first9){
	//	public void a(String first1,String first2,String first3,String first4,String first5){
		
		System.out.println((i)+": "+first1+first2+first3+first4+first5+first6+first7+first8+first9);i++;
		Assume.assumeThat(first1+first2+first3+first4+first5+first6+first7+first8+first9, is("123456789"));
/*		System.out.println(first1+first2+first3+first4+first5);
		Assume.assumeThat(first1+first2+first3+first4+first5, is("12345"));*/
	}


}
