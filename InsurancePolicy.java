class FraudClaimException extends RuntimeException {
    FraudClaimException(String msg) {
        super(msg);
    }
}

class InvalidClaimAmountException extends RuntimeException {
    InvalidClaimAmountException(String msg) {
        super(msg);
    }
}

class ClaimProcessingSystem {
    String name;
    double claimamount;
    double coveragelimit;
    int claimedyear;
    int startyear;
    int endyear;

    ClaimProcessingSystem(String name, double claimamount, double coveragelimit, int claimedyear, int startyear,
            int endyear) {
        this.name = name;
        this.claimamount = claimamount;
        this.coveragelimit = coveragelimit;
        this.claimedyear = claimedyear;
        this.startyear = startyear;
        this.endyear = endyear;
    }

    public void processClaim() throws InvalidClaimAmountException {
        if (claimamount > 0 && claimamount <= coveragelimit) {
            System.out.println("claimed amount: " + claimamount);
        } else {
            throw new InvalidClaimAmountException("amount should be less than coveragelimit");
        }
    }

    public void processCoverage() throws FraudClaimException {
        if (claimedyear <= endyear && claimedyear >= startyear) {
            System.out.println("claimed insurance successfully");
        } else {
            throw new FraudClaimException("insurance must claimed in the given period");
        }
    }

    public void processingApplication() {
        processClaim();
        processCoverage();
        System.out.println("processing application for " + name);
    }
}

public class InsurancePolicy {
    public static void main(String[] args) {
        ClaimProcessingSystem a1 = new ClaimProcessingSystem("tarun", 20000, 30000, 2022, 2020, 2028);
        ClaimProcessingSystem a2 = new ClaimProcessingSystem("manoj", 30000, 40000, 2025, 2022, 2024);

        ClaimProcessingSystem[] applications = { a1, a2 };

        for (int i = 0; i < applications.length; i++) {
            try {
                applications[i].processingApplication();
            } catch (FraudClaimException | InvalidClaimAmountException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }

    }
}
