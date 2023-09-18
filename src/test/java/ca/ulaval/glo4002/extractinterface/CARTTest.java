package ca.ulaval.glo4002.extractinterface;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CARTTest {

  @Test
  public void makeSureItIsOk() {
    CART cart = CART.EmptyCart()
        .addItem("apple", 12)
        .addItemOnce("banana")
        .addItem("strawberry", 23)
        .addItem("ice cream", 3)
        .removeItem("strawberry", 10)
        .addItem("cookies", 1)
        .removeItemOnce("apple")
        .removeItem("banana", 1)
        .addItem("cookies", 1)
        .addItem("apple", 1)
        .removeItem("apple", 40);

    double observed = cart.method();

    assertEquals(79.51d, observed, 0.005d);
  }
}
