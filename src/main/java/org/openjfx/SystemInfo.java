package org.openjfx;

/** System information. */
public final class SystemInfo {
  private SystemInfo() { }

  /**
   * @return the Java version.
   */
  public static String javaVersion() {
    return System.getProperty("java.version");
  }

  /**
   * @return the JavaFX version.
   */
  public static String javafxVersion() {
    return System.getProperty("javafx.version");
  }
}
