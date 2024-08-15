public class Stock {

  // num of shares 
  private int shares;
  // latest price of stock
  private double price;
  // share captial after each transaction 
  private double capital;

  // buy stock method
  public void buy(double p, int s) {
    shares += s;
    price = p;
    capital += s * p;
  }

  // sell stock method
  public void sell(double p, int s) {
    shares -= s;
    price = p;
    capital -= s * p;
  }

  // get shares method
  public int getShares() {
    return shares;
  }

  // get price of stock method
  public double getPrice() {
    return price;
  }

  // get total value of stock method
  public double getTotalValue() {
    return shares * price;
  }

  // get capital method
  public double getCapital() {
    return capital;
  }

  // get average price of stock method
  public double getAveragePrice() {
    return capital / getShares();
  }
}
