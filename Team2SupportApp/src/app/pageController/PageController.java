package app.pageController;
import java.util.HashMap;
import java.util.Map;

public class PageController {
    private Map<String, Object> routes;

    public PageController() {
        this.routes = new HashMap<>();
    }

    public void addRoute(String path, Object handler) {
        this.routes.put(path, handler);
    }

    public void handleRequest(String path) {
        Object handler = this.routes.get(path);
        if (handler != null) {
            if (handler instanceof Page) {
                ((Page) handler).render();
            } else if (handler instanceof PageController) {
                ((PageController) handler).handleRequest(path);
            } else {
                throw new RuntimeException("Invalid route handler");
            }
        } else {
            throw new RuntimeException("Route not found");
        }
    }
}
