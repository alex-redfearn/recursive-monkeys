package github.alex.redfearn.recursivemonkeys;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<String> body = new ArrayList<>();
    body.add("paint");
    body.add("paint");
    body.add("paint");

    BodyPaint.check(body);
  }
}