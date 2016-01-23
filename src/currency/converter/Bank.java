package currency.converter;

/**
 * Created by Michi on 22.01.2016.
 */
public class Bank {


    public static void main(String[] args){
        Money usd = Money.getUSD(500);
        System.out.println(usd.getValue() + " " + usd.getCurrency() + " are " + usd.toEuro().getValue() + " " + usd.getCurrency());
    }
}
