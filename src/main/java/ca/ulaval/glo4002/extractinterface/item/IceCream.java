package ca.ulaval.glo4002.extractinterface.item;

import ca.ulaval.glo4002.extractinterface.tax.QuebecTaxCalculator;

public class IceCream
    extends Item {

  public IceCream() {
    super(ItemName.ICE_CREAM, 4.7d, new QuebecTaxCalculator());
  }
}
