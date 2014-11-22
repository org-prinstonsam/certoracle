package superconstructorhasarguments;

/**
 * Created by user01 on 22.11.14.
 */
public class UseBar extends Bar {
  UseBar(
      super();
  )


  public static void main(String[] args) {
    Bar bar = new Bar();
    bar.takeInt();
  }
}
