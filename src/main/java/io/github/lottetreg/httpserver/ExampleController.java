package io.github.lottetreg.httpserver;

import java.nio.file.Path;

public class ExampleController extends BaseController {
  public ExampleController(HTTPRequest request) {
    super(request);
  }

  public void empty() {
  }

  public String echo() {
    return getRequest().getBody();
  }

  public Path pickles() {
    return Path.of("/pickles.jpg");
  }

  public Path picklesWithHeader() {
    addHeader("Some-Header", "HI");
    return Path.of("/pickles.jpg");
  }
}