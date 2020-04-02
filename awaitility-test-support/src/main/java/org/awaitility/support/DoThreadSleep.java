package org.awaitility.support;

/**
 * @author glick
 */
public class DoThreadSleep {

  public static void putThreadToSleep(long millisecondToSleep) throws InterruptedException
  {
    Thread.sleep(millisecondToSleep);
  }
}
