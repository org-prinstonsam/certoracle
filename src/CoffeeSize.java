import java.lang.invoke.MethodHandles;

/**
 * Created by user01 on 16.11.14.
 */
public enum CoffeeSize {
  BIG(8),
  HUGE(10),
  VERWHELMING(16) {
    public String getLidCode() {
      return "A";
    }

  };

  CoffeeSize(int ounces) {
    this.ounces = ounces;
  }

  private int ounces;

  public int getOunces () {
    return ounces;

  }

  public String getLidCode() {
    return "B";
  }


}
