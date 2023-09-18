package ca.ulaval.glo4002.extractinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import ca.ulaval.glo4002.extractinterface.item.Apple;
import ca.ulaval.glo4002.extractinterface.item.Banana;
import ca.ulaval.glo4002.extractinterface.item.Cookies;
import ca.ulaval.glo4002.extractinterface.item.IceCream;
import ca.ulaval.glo4002.extractinterface.item.Item;
import ca.ulaval.glo4002.extractinterface.item.Strawberry;

public class ItemRegistry {

  private final List<Item> registry = Arrays.asList(new Apple(), new Banana(), new Cookies(), new IceCream(), new Strawberry());

  public Item findByName(String name) {
    return registry.stream().filter((item) -> item.canHandleItem(name)).findFirst().orElseThrow(getUnknownItemException(name));
  }

  private Supplier<RuntimeException> getUnknownItemException(String name) {
    return () -> new RuntimeException(String.format("Unknown item: %s", name));
  }
}
