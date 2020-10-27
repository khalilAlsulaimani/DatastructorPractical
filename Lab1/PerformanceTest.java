/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

/**
 *
 * @author alsul
 */
/**
 * PerformanceTest.java
 * A class to test performance of linear, quadric and cubic algorithms
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PerformanceTest {

 /**
  * Test linear performance
  *
  * @param   n  Size of test 
  */
 public void linearTest(int n) {
    int loopcount=0;
    double starttime = System.nanoTime(); 
    System.out.print("O  (" + n + ") took.. ");
    for (int i=0; i<n; i++){
      loopcount++;  
    }
    double endtime = System.nanoTime();;
    System.out.println((endtime-starttime) + " nano seconds");
 }

 /**
  * Test Quadratic performance O(N^2)
  *
  * @param   n  Size of test 
  */
  public void quadraticTest(int n) {
      int loopCount=0;// just to use for the loop to test the time it takes
      int loop2Count=0;
      double startTime= System.nanoTime();// save initial time before loop
      System.out.print("O^2("+ n + ") took.. ");
      for (int i=0;i<n;i++){
          loopCount++;
          for(int j=0;j<n;j++){
              loop2Count++;
          }
      }
      double endTime = System.nanoTime();//save time after O^n oprations are done
      System.out.println((endTime-startTime)+" nano secounds");

  }

 /**
  * Test Cubic Performance O(N^3)
  *
  * @param   n  Size of test 
  */
  public void cubicTest(int n) {
      int loopCount=0;// just to use for the loop to test the time it takes
      int loop2Count=0;
      int loop3Count=0;
      double startTime= System.nanoTime();// save initial time before loop
      System.out.print("O^3("+ n + ") took.. ");
      for (int i=0;i<n;i++){
          loopCount++;
          for(int j=0;j<n;j++){
              loop2Count++;
              for(int z=0;z<n;z++){
                  loop3Count++;
              }
          }
      }
      double endTime = System.nanoTime();//save time after O^n oprations are done
      System.out.println((endTime-startTime)+" nano secounds");

  }
  
  
  /**
   * Main Method
   *
   * @param   args  commandline parameters (optional)
   */
  public static void main(String args[]) {
    PerformanceTest p = new PerformanceTest();
  
    // call methods of object p (PerformanceTest) with
    // various sizes of N and see the performance differences.
    p.linearTest(100);
    p.quadraticTest(100);
    p.cubicTest(100);
  } 
}
