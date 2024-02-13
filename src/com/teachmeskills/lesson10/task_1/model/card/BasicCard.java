package com.teachmeskills.lesson10.task_1.model.card;

import java.util.Objects;

/**
 * Create abstract class BasicCard.
 * Give permission to inherit
 * BelCard, VisaCard, MasterCard.
 * Describe the Class field.
 * Create constructor with class fields.
 * Override methods equals, hashCode, toString.
 */
public abstract sealed class BasicCard permits BelCard, VisaCard, MasterCard {

    int cvv;
    double amount;
    long numberCard;
    String nameCard;

    public BasicCard(String nameCard,
                     long numberCard,
                     double amount,
                     int cvv) {
        this.cvv = cvv;
        this.amount = amount;
        this.numberCard = numberCard;
        this.nameCard = nameCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicCard basicCard = (BasicCard) o;
        return cvv == basicCard.cvv && numberCard == basicCard.numberCard;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cvv, numberCard);
    }

    @Override
    public String toString() {
        return "Card " + nameCard + " No. " + numberCard;
    }
}
