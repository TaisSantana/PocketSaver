package com.finances.pocketsaverapi.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TypePayment {
    CREDIT("credit"), DEBIT("debit"), PIX("pix"), MONEY("money");

    private final String description;
}
