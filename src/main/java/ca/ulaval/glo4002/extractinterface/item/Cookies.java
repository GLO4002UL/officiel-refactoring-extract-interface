package ca.ulaval.glo4002.extractinterface.item;

import ca.ulaval.glo4002.extractinterface.tax.QuebecTaxCalculator;

public class Cookies
    extends Item {

  public Cookies() {
    super(ItemName.COOKIES, 10d, new QuebecTaxCalculator());
  }
}
