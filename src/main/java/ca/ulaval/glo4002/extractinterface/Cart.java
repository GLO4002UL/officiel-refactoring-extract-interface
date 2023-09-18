package ca.ulaval.glo4002.extractinterface;

import java.util.HashMap;
import java.util.Map;

public class Cart {

  private final Map<String, Integer> items;

  private final ItemRegistry itemRegistry = new ItemRegistry();

  public static Cart Empty() {
    return new Cart();
  }

  private Cart() {
    this.items = new HashMap<>();
  }

  public Cart addItem(String name) {
    return addItems(name, 1);
  }

  public Cart addItems(String name, int quantity) {
    return updateItems(name, quantity);
  }

  public Cart removeItem(String name) {
    return removeItems(name, 1);
  }

  public Cart removeItems(String name, int quantity) {
    return updateItems(name, -quantity);
  }

  private Cart updateItems(String name, int quantity) {
    int initialQuantity = items.getOrDefault(name, 0);
    int updatedQuantity = Math.max(initialQuantity + quantity, 0);
    items.put(name, updatedQuantity);
    return this;
  }

  public double checkout() {
    return items.entrySet().stream().map((entry) -> itemRegistry.findByName(entry.getKey()).computeTotal(entry.getValue())).mapToDouble(Double::doubleValue).sum();
  }
}
