package ca.ulaval.glo4002.extractinterface.item;

import ca.ulaval.glo4002.extractinterface.tax.NoTaxCalculator;

public class Apple
    extends Item {

  public Apple() {
    super(ItemName.APPLE, 1.25d, new NoTaxCalculator());
  }
}
