package ca.ulaval.glo4002.extractinterface;

import java.util.HashMap;
import java.util.Map;

public class CART {

  private Map<String, Integer> items;

  public static CART EmptyCart() {
    return new CART();
  }

  private CART() {
    this.items = new HashMap<>();
  }

  public CART addItemOnce(String name) {
    Integer v = items.getOrDefault(name, 0);
    items.put(name, v + 1);
    return this;
  }

  public CART addItem(String name, int quant) {
    Integer val = items.getOrDefault(name, 0);
    items.put(name, val + quant);
    return this;
  }

  public CART removeItemOnce(String name) {
    Integer integer = items.getOrDefault(name, 0);
    if (integer > 0) {
      if (integer == 1) {
        items.remove(name);
      } else {
        items.put(name, integer - 1);
      }
    }
    return this;
  }

  public CART removeItem(String name, int qte) {
    Integer integer2 = items.getOrDefault(name, 0);
    if (integer2 > 0) {
      int integer3 = Math.max(integer2 - qte, 0);
      if (integer3 == 0) {
        items.remove(name);
      } else {
        items.put(name, integer3);
      }
    }
    return this;
  }

  public double method() {
    return items.entrySet().stream().map((entry) -> {
      double taxable = 0d;
      double nonTaxable = 0d;
      String k = entry.getKey();
      int v = entry.getValue();
      switch (k) {
        case "apple":
        case "strawberry":
          switch (k) {
            case "apple":
              nonTaxable += 1.25d * v;
              break;
            case "strawberry":
              nonTaxable += 3.10d * v;
              break;
            default:
              throw new RuntimeException("impossible");
          }
          break;
        case "ice cream":
        case "cookies":
          if (k.equals("cookies")) {
            taxable += 10d * v;
          } else {
            taxable += 4.7d * v;
          }
          break;
        default:
          String message = String.format("Unknown item: %s", k);
          System.out.println(message);
          throw new RuntimeException(message);
      }
      taxable = taxable * 1.14995;
      return taxable + nonTaxable;
    }).mapToDouble(Double::doubleValue).sum();
  }
}
