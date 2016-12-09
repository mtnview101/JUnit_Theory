package core;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Assume;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TheoryTest {
	@DataPoint
	public static Integer i_01=1;
	@DataPoint
	public static Integer i_02=2;
	@DataPoint
	public static Integer i_03=3;
	
	@Theory
	public void a(Integer all_data_points){
		System.out.println(all_data_points);
		Assume.assumeThat(all_data_points, is(12));
	}


}
