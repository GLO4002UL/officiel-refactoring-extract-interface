package ca.ulaval.glo4002.extractinterface.tax;

public class NoTaxCalculator
    implements TaxCalculator {

  @Override
  public double applyTax(double subTotal) {
    return 0d;
  }
}
