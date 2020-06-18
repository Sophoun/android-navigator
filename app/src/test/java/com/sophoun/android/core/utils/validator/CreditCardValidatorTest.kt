package com.sophoun.android.core.utils.validator

import com.sophoun.android.core.utils.validation.CreditCardValidator
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class CreditCardValidatorTest {

    @Test
    fun `should valid all credit card`() {
        val validCards = listOf(
            "4012-8888-8888-1881", // VISA
            "5555 5555-5555 4444", // MASTER CARD
            "3782-8224 6310-005", // AMERICAN EXPRESS
            "30569309025904", // DINNER CLUB
            "6011 11111111 1117", // DISCOVER
            "3530-1113-3330-0000" // JCB
        )

        assertEquals(CreditCardValidator.isValidCard(validCards[0]), true)
        assertEquals(CreditCardValidator.isValidCard(validCards[1]), true)
        assertEquals(CreditCardValidator.isValidCard(validCards[2]), true)
        assertEquals(CreditCardValidator.isValidCard(validCards[3]), true)
        assertEquals(CreditCardValidator.isValidCard(validCards[4]), true)
        assertEquals(CreditCardValidator.isValidCard(validCards[5]), true)
    }

    @Test
    fun `should invalid all credit card`() {

        val inValidCards = listOf(
            "40128888 8888! 1881",
            "5555 5555 55552 4444",
            "3782 8224 63104005",
            "3056 9309 0259 041",
            "6011 1111 1111@1117",
            "7530 1113 3330"
        )

        assertEquals(CreditCardValidator.isValidCard(inValidCards[0]), false)
        assertEquals(CreditCardValidator.isValidCard(inValidCards[1]), false)
        assertEquals(CreditCardValidator.isValidCard(inValidCards[2]), false)
        assertEquals(CreditCardValidator.isValidCard(inValidCards[3]), false)
        assertEquals(CreditCardValidator.isValidCard(inValidCards[4]), false)
        assertEquals(CreditCardValidator.isValidCard(inValidCards[5]), false)
    }

    @Test
    fun `should valid all card type`() {
        val validCardTypes = listOf(
            "4012 8888 8888 1881", // VISA
            "5555 5555-5555 4444", // MASTER CARD
            "3782 8224 6310 005", // AMERICAN EXPRESS
            "3056 9309 0259 04", // DINNER CLUB
            "6011 1111 1111 1117", // DISCOVER
            "3530 1113 3330 0000" // JCB
        )

        assertEquals(CreditCardValidator.getCardType(validCardTypes[0]), CreditCardValidator.CardType.VISA)
        assertEquals(CreditCardValidator.getCardType(validCardTypes[1]), CreditCardValidator.CardType.MASTER_CARD)
        assertEquals(CreditCardValidator.getCardType(validCardTypes[2]), CreditCardValidator.CardType.AMERICAN_EXPRESS)
        assertEquals(CreditCardValidator.getCardType(validCardTypes[3]), CreditCardValidator.CardType.DINNER_CLUB)
        assertEquals(CreditCardValidator.getCardType(validCardTypes[4]), CreditCardValidator.CardType.DISCOVER)
        assertEquals(CreditCardValidator.getCardType(validCardTypes[5]), CreditCardValidator.CardType.JCB)
    }
}