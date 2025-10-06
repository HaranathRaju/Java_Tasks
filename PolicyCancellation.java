class CancellationNotAllowedException extends Exception {
    CancellationNotAllowedException(String msg) {
        super(msg);
    }
}

class PolicyNotFoundException extends Exception {
    PolicyNotFoundException(String msg) {
        super(msg);
    }
}

class PolicyCancel {
    String name;
    boolean iscancelled;
    boolean ispolicyfound;

    PolicyCancel(String name, boolean ispolicyfound, boolean iscancelled) {
        this.name = name;
        this.ispolicyfound = ispolicyfound;
        this.iscancelled = iscancelled;

    }

    public void checkpolicycancellation() throws CancellationNotAllowedException {
        if (!iscancelled) {
            throw new CancellationNotAllowedException("cancellation is not allowed");
        } else {
            System.out.println("policy is cancelled for " + name);
        }
    }

    public void checkpolicyfound() throws PolicyNotFoundException {
        if (!ispolicyfound) {
            throw new PolicyNotFoundException("policy not found");
        } else {
            System.out.println("policy found for " + name);
        }
    }

    public void processing() throws CancellationNotAllowedException, PolicyNotFoundException {
        checkpolicycancellation();
        checkpolicyfound();
        System.out.println("application processing for " + name);
    }

}

public class PolicyCancellation {
    public static void main(String[] args) {
        PolicyCancel a1 = new PolicyCancel("tarun", true, true);
        PolicyCancel a2 = new PolicyCancel("manoj", true, false);

        PolicyCancel[] applications = { a1, a2 };

        for (PolicyCancel i : applications) {
            try {
                i.processing();
            } catch (CancellationNotAllowedException | PolicyNotFoundException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }
}