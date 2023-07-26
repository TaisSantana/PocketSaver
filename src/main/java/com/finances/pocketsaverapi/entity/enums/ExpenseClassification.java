package com.finances.pocketsaverapi.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ExpenseClassification {

    FIXED("fixed"),VARIABLE("variable");

    private final String description;
}
