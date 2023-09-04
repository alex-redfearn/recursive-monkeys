package github.alex.redfearn.recursivemonkeys;

import java.util.List;

public class BodyPaint {

  public static void check(List<String> body) {
    if (body.contains("paint")) {
      alert();

      wash(body);
      check(body);
    }
  }

  private static void alert() {
    System.out.println("There's still a trace of body paint");
    System.out.println("On your legs and on your arms and on your face");
  }

  private static void wash(List<String> body) {
    body.remove("paint");
  }

}
