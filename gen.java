public class AddTwoValues {

  public static <T extends Number> T add(T a, T b) {
    if (a == null || b == null) {
      throw new IllegalArgumentException("Arguments cannot be null");
    }
    if (a instanceof Integer) {
      return (T) Integer.valueOf(a.intValue() + b.intValue());
    } else if (a instanceof Long) {
      return (T) Long.valueOf(a.longValue() + b.longValue());
    } else if (a instanceof Float) {
      return (T) Float.valueOf(a.floatValue() + b.floatValue());
    } else if (a instanceof Double) {
      return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
    } else {
      throw new IllegalArgumentException("Unsupported number type");
    }
  }

  public static void main(String[] args) {
    Integer intResult = add(2, 3);
    System.out.println("Integer result: " + intResult);

    Long longResult = add(1000000000L, 2000000000L);
    System.out.println("Long result: " + longResult);

    Float floatResult = add(2.5f, 3.5f);
    System.out.println("Float result: " + floatResult);

    Double doubleResult = add(0.1, 0.2);
    System.out.println("Double result: " + doubleResult);
  }
}
