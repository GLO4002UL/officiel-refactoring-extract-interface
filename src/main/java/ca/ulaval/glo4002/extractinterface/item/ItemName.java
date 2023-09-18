package ca.ulaval.glo4002.extractinterface.item;

public enum ItemName {
  APPLE("apple"),
  BANANA("banana"),
  COOKIES("cookies"),
  ICE_CREAM("ice cream"),
  STRAWBERRY("strawberry");

  public final String value;

  ItemName(String value) {
    this.value = value;
  }
}
