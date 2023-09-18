package ca.ulaval.glo4002.extractinterface.item;

import ca.ulaval.glo4002.extractinterface.tax.TaxCalculator;

public class Item {

  protected final ItemName name;

  protected final double unitPrice;

  protected final TaxCalculator taxCalculator;

  public Item(ItemName name, double unitPrice, TaxCalculator taxCalculator) {
    this.name = name;
    this.unitPrice = unitPrice;
    this.taxCalculator = taxCalculator;
  }

  public boolean canHandleItem(String item) {
    return name.value.equals(item);
  }

  public double computeTotal(int quantity) {
    double subTotal = unitPrice * quantity;
    double taxes = taxCalculator.applyTax(subTotal);
    return subTotal + taxes;
  }
}
