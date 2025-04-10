package com.jp.EletronicaOliveira.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity // Para que ela seja reconhecida como uma tabela no banco de dados
public class OrdemDeServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getAparelho() {
        return aparelho;
    }

    public void setAparelho(String aparelho) {
        this.aparelho = aparelho;
    }

    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public BigDecimal getValorPecas() {
        return valorPecas;
    }

    public void setValorPecas(BigDecimal valorPecas) {
        this.valorPecas = valorPecas;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
}
