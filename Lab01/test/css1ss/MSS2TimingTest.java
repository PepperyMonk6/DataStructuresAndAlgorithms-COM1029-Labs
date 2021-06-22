package org.com1029.lab1.css1ss;

import static org.junit.Assert.*;

import org.junit.Test;

public class MSS2TimingTest {

  ArrayGenerator ag = new ArrayGenerator();
    
  public long timeTest(int length){  // time algorithm on an array of size "length"
    int [] arr = ag.generate(-99,100,length);
    long starttime = System.currentTimeMillis();  // start timing    
    int[] res = MSS.mss2(arr);                    // run the algorithm
    long endtime = System.currentTimeMillis();    // end timing
    return (endtime - starttime);                 // return the time taken
  }
  
 	public void steps(int number, int step) {
    long time;
    int length;
	  for(int i = 1; i <= number; i++){
	     length = i * step;
       time = timeTest(length);
       System.out.println("array length = "+length+"; duration = "+time+" milliseconds");       
     }
	}

 	@Test
 	public void timerTest(){
 	  steps(30,1000); // first parameter: number of steps, 
 	                     // second parameter: size of step
 	}
 	
}
