package com.company;

public class TransactionUtil {

    public static void executeTransaction(BaseWallet from, BaseWallet to, double amount) {
        try {
            if (from.getAmount().doubleValue() < amount) {
                throw new NotEnoughMoneyException("You don't have enough money in your account");
            }
            from.setAmount(from.getAmount().doubleValue() - amount);
            to.setAmount(to.getAmount().doubleValue() + amount);
            System.out.println("Transaction completed successfully. Account balance " + from.getAmount());
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        }
    }
}
