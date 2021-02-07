package DefiningClasses.BankAccount;
//created by J.M.

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<Integer, BankAccount> bankAccountInfo = new HashMap<>();
        String input;

        while (!"End".equals(input = scan.nextLine())) {
            String[] command = input.split("\\s+");
            String output = null;

            switch (command[0]) {
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    bankAccountInfo.put(bankAccount.getId(), bankAccount);
                    output = String.format("Account ID%d created", bankAccount.getId());
                    break;
                case "Deposit":
                    int id = Integer.parseInt(command[1]);
                    int amount = Integer.parseInt(command[2]);
                    if (bankAccountInfo.containsKey(id)) {
                        bankAccountInfo.get(id).deposit(amount);
                        output = String.format("Deposited %d to ID%d", amount, id);
                    } else {
                        output = "Account does not exist";
                    }
                    break;
                case "SetInterest":
                    double newInterestRate = Double.parseDouble(command[1]);
                    BankAccount.setInterestRate(newInterestRate);
                    output = null;
                    break;
                case "GetInterest":
                    id = Integer.parseInt(command[1]);
                    int years = Integer.parseInt(command[2]);
                    if (bankAccountInfo.containsKey(id)) {
                        double interest = bankAccountInfo.get(id).getInterest(years);
                        output = String.format("%.2f", interest);
                    } else {
                        output = "Account does not exist";
                    }
                    break;
            }
            if (output != null) {
                System.out.println(output);
            }
        }
    }
}
