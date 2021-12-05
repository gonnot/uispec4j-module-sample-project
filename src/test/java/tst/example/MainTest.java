package tst.example;

import org.example.Main;
import org.junit.jupiter.api.Test;
import org.uispec4j.Panel;
import org.uispec4j.Trigger;
import org.uispec4j.UISpec4J;
import org.uispec4j.Window;
import org.uispec4j.interception.WindowHandler;
import org.uispec4j.interception.WindowInterceptor;

import static org.uispec4j.assertion.UISpecAssert.assertTrue;

class MainTest {

  static {
    UISpec4J.init();
  }

  @Test
  void name() {
    Panel panel = new Panel(new Main());
    assertTrue(panel.containsLabel("Boris"));
  }

  @Test
  void interceptor() {
    WindowInterceptor
      .init(() -> Main.main(new String[0]))
      .process(new WindowHandler() {
        @Override
        public Trigger process(Window window) {
          assertTrue(window.containsLabel("Boris"));
          return Trigger.DO_NOTHING;
        }
      })
      .run();
  }

  @Test
  void empty() {
  }
}