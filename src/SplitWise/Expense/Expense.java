package SplitWise.Expense;

import SplitWise.Expense.Split.Split;
import SplitWise.Expense.Split.SplitType;
import SplitWise.User.User;

import java.util.List;

public class Expense {

    int expenseId;
    String description;
    Double totalAmount;
    User paidByUser;
    SplitType splitType;
    List<Split> splits;

    public Expense(int expenseId, String description, Double totalAmount, User paidByUser,
                   SplitType splitType, List<Split> splits) {
        this.expenseId = expenseId;
        this.description = description;
        this.totalAmount = totalAmount;
        this.paidByUser = paidByUser;
        this.splitType = splitType;
        this.splits = splits;
    }

}
