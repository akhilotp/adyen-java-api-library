/*
 * Adyen Checkout Service
 * Adyen Checkout API provides a simple and flexible way to initiate and authorise online payments. You can use the same integration for payments made with cards (including One-Click and 3D Secure), mobile wallets, and local payment methods (e.g. iDEAL and Sofort).  This API reference provides information on available endpoints and how to interact with them. To learn more about the API, visit [Checkout documentation](https://docs.adyen.com/developers/checkout).  ## Authentication Each request to the Checkout API must be signed with an API key. For this, obtain an API Key from your Customer Area, as described in [How to get the Checkout API key](https://docs.adyen.com/developers/user-management/how-to-get-the-checkout-api-key). Then set this key to the `X-API-Key` header value, for example:  ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: Your_Checkout_API_key\" \\ ... ``` Note that when going live, you need to generate a new API Key to access the [live endpoints](https://docs.adyen.com/developers/api-reference/live-endpoints).  ## Versioning Checkout API supports versioning of its endpoints through a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://checkout-test.adyen.com/v32/payments ```
 *
 * OpenAPI spec version: 32
 * Contact: support@adyen.com
 *
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import com.google.gson.annotations.SerializedName;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PaymentMethodsResponse
 */
public class PaymentMethodsResponse {

  @SerializedName("oneClickPaymentMethods")
  private List<RecurringDetail> oneClickPaymentMethods = null;
  
  @SerializedName("paymentMethods")
  private List<PaymentMethod> paymentMethods = null;
  
  public PaymentMethodsResponse oneClickPaymentMethods(List<RecurringDetail> oneClickPaymentMethods) {
    this.oneClickPaymentMethods = oneClickPaymentMethods;
    return this;
  }

  public PaymentMethodsResponse addOneClickPaymentMethodsItem(RecurringDetail oneClickPaymentMethodsItem) {
    
    if (this.oneClickPaymentMethods == null) {
      this.oneClickPaymentMethods = new ArrayList<RecurringDetail>();
    }
    
    this.oneClickPaymentMethods.add(oneClickPaymentMethodsItem);
    return this;
  }
  
  /**
  * Detailed list of one-click payment methods.
  * @return oneClickPaymentMethods
  **/
  public List<RecurringDetail> getOneClickPaymentMethods() {
    return oneClickPaymentMethods;
  }
  public void setOneClickPaymentMethods(List<RecurringDetail> oneClickPaymentMethods) {
    this.oneClickPaymentMethods = oneClickPaymentMethods;
  }
  
  public PaymentMethodsResponse paymentMethods(List<PaymentMethod> paymentMethods) {
    this.paymentMethods = paymentMethods;
    return this;
  }

  public PaymentMethodsResponse addPaymentMethodsItem(PaymentMethod paymentMethodsItem) {
    
    if (this.paymentMethods == null) {
      this.paymentMethods = new ArrayList<PaymentMethod>();
    }
    
    this.paymentMethods.add(paymentMethodsItem);
    return this;
  }
  
  /**
  * Detailed list of payment methods required to generate payment forms.
  * @return paymentMethods
  **/
  public List<PaymentMethod> getPaymentMethods() {
    return paymentMethods;
  }
  public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodsResponse paymentMethodsResponse = (PaymentMethodsResponse) o;
    return Objects.equals(this.oneClickPaymentMethods, paymentMethodsResponse.oneClickPaymentMethods) &&
        Objects.equals(this.paymentMethods, paymentMethodsResponse.paymentMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oneClickPaymentMethods, paymentMethods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodsResponse {\n");

    sb.append("    oneClickPaymentMethods: ").append(toIndentedString(oneClickPaymentMethods)).append("\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  
}


