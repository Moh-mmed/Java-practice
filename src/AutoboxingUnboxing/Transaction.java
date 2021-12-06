package AutoboxingUnboxing;

public class Transaction {
    private String sender;
    private String receiver;
    private String senderBranch;
    private String receiverBranch;
    private double amount;

    public Transaction(String sender, String receiver, String senderBranch, String receiverBranch, double amount) {
        this.sender = sender;
        this.receiver = receiver;
        this.senderBranch = senderBranch;
        this.receiverBranch = receiverBranch;
        this.amount = amount;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getSenderBranch() {
        return senderBranch;
    }

    public String getReceiverBranch() {
        return receiverBranch;
    }

    public double getAmount() {
        return amount;
    }
}
