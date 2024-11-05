package org.openjfx;

/** System information. */
public class SystemInfo {
  /** Get the Java version. */
  public static String javaVersion() {
    return System.getProperty("java.version");
  }

  /** Get the JavaFX version. */
  public static String javafxVersion() {
    return System.getProperty("javafx.version");
  }
}
