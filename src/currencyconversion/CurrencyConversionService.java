
package currencyconversion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jenna
 */
public class CurrencyConversionService {
    private List<CurrencyConversionStrategy> currencyStrategy;
    
    public CurrencyConversionService(CurrencyConversionStrategy one, CurrencyConversionStrategy two) {
        List<CurrencyConversionStrategy> conversionList = new ArrayList<>(2);
        conversionList.add(one);
        conversionList.add(two);
    }

    public final List<CurrencyConversionStrategy> getCurrencyStrategy() {
        return currencyStrategy;
    }

    public final void setCurrencyStrategy(CurrencyConversionStrategy firstCurrencyStrategy, 
            CurrencyConversionStrategy secondCurrencyStrategy) {
        if (firstCurrencyStrategy == null || secondCurrencyStrategy == null) {
            throw new IllegalArgumentException("Both currency strategies must be set!");
        } else {
            
        }
    }

    
    
}
