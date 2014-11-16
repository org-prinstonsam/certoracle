/**
 * Created by user01 on 16.11.14.
 */
public class CoffeeTest {
  public static void main(String[] args) {
    Coffee drink = new Coffee();
    drink.size = CoffeeSize.VERWHELMING;
    System.out.println(drink.size.getLidCode());
    System.out.println(drink.size.getOunces());
    drink.size = CoffeeSize.BIG;
    System.out.println(drink.size.getLidCode());
    System.out.println(drink.size.getOunces());
    drink.size = CoffeeSize.HUGE;
    System.out.println(drink.size.getLidCode());
    System.out.println(drink.size.getOunces());
  }
}
