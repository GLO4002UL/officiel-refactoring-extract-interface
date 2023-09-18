package ca.ulaval.glo4002.extractinterface.tax;

public class QuebecTaxCalculator
    implements TaxCalculator {

  public static final double QUEBEC_COMBINED_TAX_RATE = 0.14995;

  @Override
  public double applyTax(double subTotal) {
    return subTotal * QUEBEC_COMBINED_TAX_RATE;
  }
}
