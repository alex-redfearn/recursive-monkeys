package github.alex.redfearn.recursivemonkeys;

import java.util.List;

public class BodyPaint {

  public static void check(List<Paint> body) {
    if (!body.isEmpty()) {
      System.out.println("There's still a trace of body paint");
      System.out.println("On your legs and on your arms and on your face");

      wash(body);
      check(body);
    }
  }

  private static void wash(List<Paint> body) {
    body.remove(0);
  }
}
