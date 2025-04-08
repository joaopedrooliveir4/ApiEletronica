package com.jp.EletronicaOliveira.service;

import com.jp.EletronicaOliveira.model.OrdemDeServico;
import com.jp.EletronicaOliveira.repository.OrdemDeServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdemDeServicoService {

    @Autowired
    private OrdemDeServicoRepository ordemDeServicoRepository; // Aqui eu uso o repositório pra acessar os dados do banco

     public List<OrdemDeServico> listarTodas() {
         // Esse método pega todas as ordens de serviço salvas
         return ordemDeServicoRepository.findAll();
     }
}
