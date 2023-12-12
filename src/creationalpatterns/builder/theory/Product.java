package creationalpatterns.builder.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * Product: представляет объект, который должен быть создан. В данном случае все части объекта заключены в списке parts.
 */
public class Product {
    List<Object> parts = new ArrayList<>();
    public void add(String part) {
        parts.add(part);
    }
}
