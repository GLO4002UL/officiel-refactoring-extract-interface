package ca.ulaval.glo4002.extractinterface.item;

import ca.ulaval.glo4002.extractinterface.tax.NoTaxCalculator;

public class Banana
    extends Item {

  public Banana() {
    super(ItemName.BANANA, 0.12d, new NoTaxCalculator());
  }
}
