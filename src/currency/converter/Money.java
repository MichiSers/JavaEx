package currency.converter;

/**
 * Created by Michi on 22.01.2016.
 */
public class Money {
    private int value;
    private String currency;
    private int rate;

    private Money(int value, String currency, int rate){
        this.value = value;
        this.currency = currency;
        this.rate = rate;
    }

    public static Money getUSD(int value){
        return new Money(value, "USD", 2);
    }

    public static Money getYen(int value){
        return new Money(value, "Yen", 100);
    }

    public static Money getEU(int value){
        return new Money(value, "EU", 1);
    }

    public Money toEuro(){
        this.currency = "EU";
        this. value = value * rate;
        return this;
    }

    public int getExchangeRate(){
        return new Integer(rate);
    }

    public int getValue(){
        return new Integer(value);
    }

    public String getCurrency(){
        return new String(currency);
    }

}
