package com.finances.pocketsaverapi.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ExpenseCategory {
    HOUSING("housing"),TRANSPORTATION("transportation"),HEALTH("health"),EDUCATION("education"),
    FOOD("Food"),CLOTHING("clothing"),ENTERTAINMENT("entertainment"),DEBTS("debts");

    private final String description;

}
