class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

class PoorDrivingRecordException extends Exception {
    PoorDrivingRecordException(String msg) {
        super(msg);
    }
}

class HealthIssueException extends Exception {
    HealthIssueException(String msg) {
        super(msg);
    }
}

class Policy {
    String name;
    int age;
    boolean hasbaddriving;
    boolean hashealthissue;

    Policy(String name, int age, boolean hasbaddriving, boolean hashealthissue) {
        this.name = name;
        this.age = age;
        this.hasbaddriving = hasbaddriving;
        this.hashealthissue = hashealthissue;
    }

    public void checkage() throws InvalidAgeException {
        if (age < 18 || age > 70) {
            throw new InvalidAgeException("age must be greater than 18");
        } else {
            System.out.println("age is : " + age);
        }

    }

    public void checkDrivingRecord() throws PoorDrivingRecordException {
        if (hasbaddriving) {
            throw new PoorDrivingRecordException("driving record is poor");
        } else {
            System.out.println("driving record is good");
        }
    }

    public void checkHealthIssue() throws HealthIssueException {
        if (hashealthissue) {
            throw new HealthIssueException("health issue found");
        } else {
            System.out.println("no health issues found");
        }

    }

    public void processApplication() throws InvalidAgeException, PoorDrivingRecordException, HealthIssueException {
        checkage();
        checkDrivingRecord();
        checkHealthIssue();
        System.out.println("application processing for " + name);
    }
}

public class PolicyApplication {
    public static void main(String[] args) {
        Policy a1 = new Policy("tarun", 18, true, false);
        Policy a2 = new Policy("manoj", 22, false, true);
        Policy[] applications = { a1, a2 };

        for (int i = 0; i < applications.length; i++) {
            try {
                applications[i].processApplication();

            } catch (InvalidAgeException | PoorDrivingRecordException | HealthIssueException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }

}
