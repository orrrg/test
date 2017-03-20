package pl.kubiczak.orrrg.test.orrrgtest;

public class Hello {

  String getMessage(String name) {

    if (true) {
      String msg = "this should be picked-up by SonarQube";
    }

    return "Hello " + name + "!";
  }
}
