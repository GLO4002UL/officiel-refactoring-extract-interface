package ca.ulaval.glo4002.extractinterface;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CartTest {

  @Test
  public void makeSureItIsOk() {
    Cart cart = Cart.Empty()
        .addItems("apple", 12)
        .addItem("banana")
        .addItems("strawberry", 23)
        .addItems("ice cream", 3)
        .removeItems("strawberry", 10)
        .addItems("cookies", 1)
        .removeItem("apple")
        .removeItems("banana", 1)
        .addItems("cookies", 1)
        .addItems("apple", 1)
        .removeItems("apple", 40);

    double observed = cart.checkout();

    assertEquals(79.51d, observed, 0.005d);
  }
}
