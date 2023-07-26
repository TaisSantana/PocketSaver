package com.finances.pocketsaverapi.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Bank {
    BANCO_DO_BRASIL("001", "Banco do Brasil"),
    CAIXA_ECONOMICA_FEDERAL("104", "Caixa Econômica Federal"),
    BRADESCO("237", "Bradesco"),
    ITAU("341", "Itaú"),
    SANTANDER("033", "Santander"),
    BANCO_DO_ESTADO_DO_RIO_GRANDE_DO_SUL("041", "Banco do Estado do Rio Grande do Sul - Banrisul"),
    HSBC("399", "HSBC"),
    BANCO_RURAL("453", "Banco Rural"),
    BANCO_SAFRA("422", "Banco Safra"),
    BANCO_MERCANTIL_DO_BRASIL("389", "Banco Mercantil do Brasil"),
    INTER("077", "Inter"),
    NUBANK("260", "Nubank"),
    ORIGINAL("212", "Banco Original"),
    SICOOB("756", "Sicoob"),
    SICREDI("748", "Sicredi"),
    BANCO_CITIBANK("745", "Banco Citibank"),
    BANCO_BMG("318", "Banco BMG"),
    CAIXA_ECONOMICA_ESTADUAL("104", "Caixa Econômica Estadual"),
    BANCOOB("756", "Bancoob"),
    BANCO_BANRISUL("041", "Banco Banrisul"),
    BANCO_ORIGINAL("212", "Banco Original"),
    BANCO_NEXT("237", "Banco Next"),
    BANCO_SICOOB("756", "Banco Sicoob"),
    BANCO_HSBC("399", "HSBC"),
    BANCO_CREDIT_AGRICOLE("222", "Banco Credit Agricole"),
    BANCO_JPMORGAN("488", "Banco JPMorgan"),
    BANCO_CREDIT_SUISSE("229", "Banco Credit Suisse"),
    BANCO_DIGIO("197", "Banco Digio"),
    BANCO_PAN("623", "Banco PAN"),
    BANCO_MODAL("746", "Banco Modal"),
    BANCO_BVA("044", "Banco BVA"),
    BANCO_BRASIL_PLURAL("125", "Banco Brasil Plural"),
    OUTROS("999", "Outros");

    private final String codigo;
    private final String nome;
}
