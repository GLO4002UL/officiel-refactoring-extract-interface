package ca.ulaval.glo4002.extractinterface.item;

import ca.ulaval.glo4002.extractinterface.tax.NoTaxCalculator;

public class Strawberry
    extends Item {

  public Strawberry() {
    super(ItemName.STRAWBERRY, 3.10d, new NoTaxCalculator());
  }
}
