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
public class TheoryTestArray {
	@DataPoints
	public static Integer[] i_array(){
		return new Integer[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};}

	
	@Theory
	public void a(Integer all_data_points){
		System.out.println(all_data_points);
		Assume.assumeThat(all_data_points, is(12));
	}


}
