package co.com.bancolombia.model.customer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class DetailCustomer {
    private String paymentFormat;
    private String paymentApplication;
    private String affectsLotCreditPago;
    private String noBankOperator;
    private String comissionChargeScheme;
    private String comissionDebitForm;
    private String comissionTime;
    private String mensionsPayingEntity;
    private String noveltyPayrollReport;
    private String schemePayrollAccount;
    private String generateCheque;
    private String cashPayments;
    private String formatModality;
    private String versionTyC;
}
