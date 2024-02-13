package com.teachmeskills.lesson10.task_1.service;

import com.teachmeskills.lesson10.task_1.model.card.BasicCard;
import com.teachmeskills.lesson10.task_1.model.client.Client;

/**
 * Create class CardService.
 * Create CheckDuplicateCard method
 * with input parameters card array
 * and object client.
 * Implement the logic for comparing card.
 */
public class CardService {

    public static void CheckDuplicateCard(BasicCard[] cards, Client client) {
        int count = 0;

        if (cards == null) {
            System.out.println(client.getName() + " client doesn't have a bank card.");
        } else {
            for (int i = 0; i < cards.length; i++) {
                for (int j = i + 1; j < cards.length; j++) {
                    if (cards[i].equals(cards[j])) {
                        System.out.println(cards[i] + " is a duplicate of " + cards[j] + " cards.");
                        count++;
                    }
                }
            }
        }

        if (count < 0) {
            System.out.println("You don't have duplicate cards");
        } else {
            System.out.println(client.getName() + " client has " +
                    count + " duplicate cards.");
        }
    }

}
