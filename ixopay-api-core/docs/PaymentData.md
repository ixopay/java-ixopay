

# PaymentData

## oneOf schemas
* [IbanData](IbanData.md)
* [WalletData](WalletData.md)

## Example
```java
// Import classes:
import com.ixopay.core.model.PaymentData;
import com.ixopay.core.model.IbanData;
import com.ixopay.core.model.WalletData;

public class Example {
    public static void main(String[] args) {
        PaymentData examplePaymentData = new PaymentData();

        // create a new IbanData
        IbanData exampleIbanData = new IbanData();
        // set PaymentData to IbanData
        examplePaymentData.setActualInstance(exampleIbanData);
        // to get back the IbanData set earlier
        IbanData testIbanData = (IbanData) examplePaymentData.getActualInstance();

        // create a new WalletData
        WalletData exampleWalletData = new WalletData();
        // set PaymentData to WalletData
        examplePaymentData.setActualInstance(exampleWalletData);
        // to get back the WalletData set earlier
        WalletData testWalletData = (WalletData) examplePaymentData.getActualInstance();
    }
}
```


