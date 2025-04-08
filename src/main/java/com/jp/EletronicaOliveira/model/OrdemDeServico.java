package com.jp.EletronicaOliveira.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity // Para que ela seja reconhecida como uma tabela no banco de dados
public class OrdemDeServico {
    @NotBlank
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //  esse campo é a chave
    // primária e será gerado automaticamente
    private Long id;

    @NotBlank
    private String nome;

    private String endereco;

    @NotBlank
    private String telefone;

    @NotBlank
    private String aparelho;

    @NotBlank
    private String defeito;

    @PositiveOrZero
    private BigDecimal valorPecas; // BigDecimal é mais preciso para valores monetários

    @PositiveOrZero
    private BigDecimal valorTotal;
}
