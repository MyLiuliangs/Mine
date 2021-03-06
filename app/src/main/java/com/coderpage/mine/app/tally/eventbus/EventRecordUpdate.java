package com.coderpage.mine.app.tally.eventbus;

import com.coderpage.mine.app.tally.data.Expense;

/**
 * @author abner-l. 2017-03-19
 */
public class EventRecordUpdate {
    private final Expense mExpense;

    public EventRecordUpdate(Expense expense) {
        mExpense = expense;
    }

    public Expense getExpenseItem() {
        return mExpense;
    }
}
