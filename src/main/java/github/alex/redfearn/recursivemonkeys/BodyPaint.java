package github.alex.redfearn.recursivemonkeys;

public class BodyPaint {

  public static void play(int loop) {

    if (loop > 0) {
      System.out.println("There's still a trace of body paint");
      System.out.println("On your legs and on your arms and on your face");

      play(loop - 1);
    }

  }

}
