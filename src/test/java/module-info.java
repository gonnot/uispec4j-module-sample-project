// https://sormuras.github.io/blog/2018-09-11-testing-in-the-modular-world.html
open module ut.example.uispec {
  requires org.example.uispec;

  requires org.uispec4j;
  requires org.junit.jupiter;

//  opens ut.example.uispec to org.junit.platform.commons;
}