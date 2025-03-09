interface PaymentStrategy {
    void pay(double amount);
}

class CashPayment implements PaymentStrategy {
    public void pay(double amount) { System.out.println("Thanh toán tiền mặt: " + amount); }
}

class BankTransferPayment implements PaymentStrategy {
    public void pay(double amount) { System.out.println("Thanh toán chuyển khoản: " + amount); }
}

class MomoPayment implements PaymentStrategy {
    public void pay(double amount) { System.out.println("Thanh toán Momo: " + amount); }
}

class Order {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void processPayment(double amount) {
        paymentStrategy.pay(amount);
    }
}

