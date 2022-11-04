

# PaymentData

## oneOf schemas
* [PaymentIbanData](PaymentIbanData.md)
* [PaymentWalletData](PaymentWalletData.md)

## Example
```java
// Import classes:
import com.ixopay.client.core.model.PaymentData;
import com.ixopay.client.core.model.PaymentIbanData;
import com.ixopay.client.core.model.PaymentWalletData;

public class Example {
    public static void main(String[] args) {
        PaymentData examplePaymentData = new PaymentData();

        // create a new PaymentIbanData
        PaymentIbanData examplePaymentIbanData = new PaymentIbanData();
        // set PaymentData to PaymentIbanData
        examplePaymentData.setActualInstance(examplePaymentIbanData);
        // to get back the PaymentIbanData set earlier
        PaymentIbanData testPaymentIbanData = (PaymentIbanData) examplePaymentData.getActualInstance();

        // create a new PaymentWalletData
        PaymentWalletData examplePaymentWalletData = new PaymentWalletData();
        // set PaymentData to PaymentWalletData
        examplePaymentData.setActualInstance(examplePaymentWalletData);
        // to get back the PaymentWalletData set earlier
        PaymentWalletData testPaymentWalletData = (PaymentWalletData) examplePaymentData.getActualInstance();
    }
}
```


