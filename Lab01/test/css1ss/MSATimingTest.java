/**
 * MSATimingTest.java
 */

package org.com1029.lab1.css1ss;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author steveschneider
 */
public class MSATimingTest {

  ArrayGenerator ag = new ArrayGenerator();
  
    public long timeTest(int s) {
      /*
       *      Generate a random array to pass to the algorithm
       *      
       *      Change the third parameter in ag.generate 
       *      to change the size of the array the algorithm runs on
       */   
          int [][] arr = ag.generate2d(-9,10,s);
//          start timing    
          long starttime = System.currentTimeMillis();
//          run the algorithm
          int [] res = MSA.maxSumArea(arr);
//    calculate the time taken
          long endtime = System.currentTimeMillis();
//          print out the result    
          return (endtime - starttime);
  }

    public void steps(int number, int step) {
      long time;
      int length;
      for(int i = 1; i <= number; i++){
         length = i * step;
         time = timeTest(length);
         System.out.println("array size = "+length+"; duration = "+time+" milliseconds");       
//         System.out.println(length+", "+time);       
       }
    }

    @Test
    public void timerTest(){
      steps(20,5); // first parameter: number of steps, 
                         // second parameter: size of step
    }
        
}
