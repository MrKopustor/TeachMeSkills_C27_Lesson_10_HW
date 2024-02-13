package com.teachmeskills.lesson10.task_1.fabric;

import com.teachmeskills.lesson10.task_1.model.card.BasicCard;
import com.teachmeskills.lesson10.task_1.model.card.BelCard;
import com.teachmeskills.lesson10.task_1.model.card.MasterCard;
import com.teachmeskills.lesson10.task_1.model.card.VisaCard;

/**
 * Create class FabricCard.
 * Creating card
 * Transfer them to an array "cards"
 */
public class FabricCard {
    public static BasicCard[] createCards() {

        BasicCard card1 = new BelCard(
                "BelCard",
                1111_4728_2472_2474L,
                55.5,
                567);
        BasicCard card2 = new MasterCard(
                "MasterCard",
                2222_5235_2352_2352L,
                1000,
                991);
        BasicCard card3 = new VisaCard(
                "VisaCard",
                3333_8443_4584_4582L,
                5,
                145);
        BasicCard card4 = new MasterCard(
                "MasterCard",
                2222_5235_2352_2352L,
                1000,
                991);

        BasicCard[] cards = {card1, card2, card3, card4};

        return cards;
    }

}
