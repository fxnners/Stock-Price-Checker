public class Main {

   public static void main(String[] args) {

        // stock variable
        Stock abcCompany = new Stock();

        // buy stocks 
        abcCompany.buy(36.6, 2000);
        abcCompany.buy(39.9, 3000);

        // sell stocks
        abcCompany.sell(45.5, 1000);

        System.out.println("Stock Price: " + abcCompany.getPrice());
        System.out.println("Number of Shares: " + abcCompany.getShares());
        System.out.println("Total Value: " + abcCompany.getTotalValue());
        System.out.println("Capital: " + abcCompany.getCapital());
        System.out.println("Average Price: " + abcCompany.getAveragePrice());
    }
}
