package com.jp.EletronicaOliveira.repository;

import com.jp.EletronicaOliveira.model.OrdemDeServico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrdemDeServicoRepository  extends JpaRepository<OrdemDeServico, Long> {

    List<OrdemDeServico> findByNome(String nome);

    List<OrdemDeServico> findByNomeContainingIgnoreCase(String nome);

    List<OrdemDeServico> findByTelefone(String telefone);

    List<OrdemDeServico> findByAparelhoContainingIgnoreCase(String aparelho);
}
