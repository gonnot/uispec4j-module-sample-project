// https://sormuras.github.io/blog/2018-09-11-testing-in-the-modular-world.html
module uispec.essai.tst {
  requires uispec.essai;

  //  copied from main module
  requires java.desktop;
  // additional test requirement
  requires org.uispec4j;
  requires org.junit.jupiter;

  opens tst.example to org.junit.platform.commons;
}