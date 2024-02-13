package com.teachmeskills.lesson10.task_1.run;

import com.teachmeskills.lesson10.task_1.fabric.FabricCard;
import com.teachmeskills.lesson10.task_1.model.client.Client;

import static com.teachmeskills.lesson10.task_1.service.CardService.CheckDuplicateCard;

/**
 * Create class Runner.
 * Create object client.
 * Call the method CheckDuplicateCard,
 * with input parameters card array,
 * and object client.
 */
public class Runner {
    public static void main(String[] args) {
        Client client = new Client("Alex", "Flopovich", 43);
        CheckDuplicateCard(FabricCard.createCards(), client);

    }
}
