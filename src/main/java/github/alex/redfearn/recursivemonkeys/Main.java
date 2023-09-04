package github.alex.redfearn.recursivemonkeys;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Paint> body = new ArrayList<>();
    body.add(new Paint("Red"));
    body.add(new Paint("Green"));
    body.add(new Paint("Yellow"));

    BodyPaint.check(body);
  }
}