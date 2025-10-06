class PolicyExpiredException extends Exception {
    PolicyExpiredException(String message) {
        super(message);
    }
}

class PaymentPendingException extends Exception {
    PaymentPendingException(String message) {
        super(message);
    }
}

class NonComplianceException extends Exception {
    NonComplianceException(String message) {
        super(message);
    }
}
class PolicyRenewal {
    String policyHolderName;
    boolean isPolicyActive;
    boolean isPaymentComplete;
    boolean isCompliant;

    PolicyRenewal(String policyHolderName, boolean isPolicyActive, boolean isPaymentComplete, boolean isCompliant) {
        this.policyHolderName = policyHolderName;
        this.isPolicyActive = isPolicyActive;
        this.isPaymentComplete = isPaymentComplete;
        this.isCompliant = isCompliant;
    }
    public void renewPolicy() throws PolicyExpiredException, PaymentPendingException, NonComplianceException {
        if (!isPolicyActive) {
            throw new PolicyExpiredException("Policy has expired for " + policyHolderName);
        }
        if (!isPaymentComplete) {
            throw new PaymentPendingException("Payment is pending for " + policyHolderName);
        }
        if (!isCompliant) {
            throw new NonComplianceException("Policyholder " + policyHolderName + " is not compliant with renewal terms");
        }

        System.out.println("Policy renewed successfully for " + policyHolderName);
    }
}

public class PolicyRenew {
    public static void main(String[] args) {
        PolicyRenewal p1 = new PolicyRenewal("tarun", true, true, true);
        PolicyRenewal p2 = new PolicyRenewal("manoj", false, true, true);
        PolicyRenewal p3 = new PolicyRenewal("yash", true, false, true);
        PolicyRenewal p4 = new PolicyRenewal("henry", true, true, false);

        PolicyRenewal[] policies = {p1, p2, p3, p4};

        for (PolicyRenewal policy : policies) {
            try {
                policy.renewPolicy();
            } catch (PolicyExpiredException e) {
                System.out.println("Checked Exception: " + e.getMessage());
            } catch (PaymentPendingException e) {
                System.out.println("Checked Exception: " + e.getMessage());
            } catch (NonComplianceException e) {
                System.out.println("Checked Exception: " + e.getMessage());
            }
        }
    }
}