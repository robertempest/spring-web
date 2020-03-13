package my.spring.web;

import static org.junit.Assert.*;

import org.junit.*;

public class MainClass2Test {
  @Test
  public void testAssertEquals1() {
    assertEquals("1", "1");
  }

  @Test
  public void testAssertEquals2() {
    assertEquals("2", "3");
  }
}