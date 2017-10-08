
package currencyconversion;

/**
 *
 * @author Jenna
 */
public interface CurrencyConversionStrategy {
    public abstract double convertCurrency(CurrencyConversionStrategy one, CurrencyConversionStrategy two);
}
