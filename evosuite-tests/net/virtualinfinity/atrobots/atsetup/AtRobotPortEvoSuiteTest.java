/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.atsetup;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.Collection;
import net.virtualinfinity.atrobots.atsetup.AtRobotPort;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AtRobotPortEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AtRobotPort atRobotPort0 = AtRobotPort.MINELAYER;
      int int0 = atRobotPort0.getSymbolValue();
      assertEquals(22, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      AtRobotPort atRobotPort0 = AtRobotPort.MINELAYER;
      Collection<String> collection0 = atRobotPort0.getSymbolNames();
      assertEquals(false, collection0.isEmpty());
  }

  @Test
  public void test2()  throws Throwable  {
      String string0 = AtRobotPort.nameOf((short)1963);
      assertEquals("<unknown>", string0);
      assertNotNull(string0);
  }

  @Test
  public void test3()  throws Throwable  {
      String string0 = AtRobotPort.nameOf((short)1);
      assertEquals("P_SPEDOMETER", string0);
      assertNotNull(string0);
  }
}