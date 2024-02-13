package com.teachmeskills.lesson10.task_1.model.card;

/**
 * Create class BelCard
 * Extends from BasicCard
 * We use the keyword final
 * Create constructor
 */
public final class MasterCard extends BasicCard {

    public MasterCard(String nameCard, long numberCard, double amount, int cvv) {
        super(nameCard, numberCard, amount, cvv);
    }

}
