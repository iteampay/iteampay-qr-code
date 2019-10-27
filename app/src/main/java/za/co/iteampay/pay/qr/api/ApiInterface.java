package za.co.iteampay.pay.qr.api;

import za.co.iteampay.pay.qr.api.request.PaymentRequest;
import za.co.iteampay.pay.qr.api.response.PaymentResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("/merchantTransferFundingAndPayment")
    Call<PaymentResponse> makePayment(@Body PaymentRequest request);

}
