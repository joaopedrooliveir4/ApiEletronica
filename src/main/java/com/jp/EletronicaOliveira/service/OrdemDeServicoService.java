package com.jp.EletronicaOliveira.service;

import com.jp.EletronicaOliveira.model.OrdemDeServico;
import com.jp.EletronicaOliveira.repository.OrdemDeServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdemDeServicoService {

    @Autowired
    private OrdemDeServicoRepository ordemDeServicoRepository; // Aqui eu uso o repositório pra acessar os dados do banco

     public List<OrdemDeServico> listarTodas() {
         // Esse método pega todas as ordens de serviço salvas
         return ordemDeServicoRepository.findAll();
     }

     // Nessa parte filtramos nossas Ordens com base em: id, nome, telefone e aparelho
     public Optional<OrdemDeServico> buscarOrdemPorId(Long id) {
         // O objeto Optional diferente de List evita o erro caso o retorno seja null,
         // sendo assim esse método pode ou não me retornar algo evitando a exeção
         return ordemDeServicoRepository.findById(id);
     }

     // Os métodos list vão me retornar uma lista com cada parâmetro igual
     public List<OrdemDeServico> buscarOrdemPorNome(String nome) {
         return ordemDeServicoRepository.findByNomeContainingIgnoreCase(nome);
     }

     public List<OrdemDeServico> buscarOrdemPorTelefone(String telefone) {
         return ordemDeServicoRepository.findByTelefone(telefone);
     }

     public List<OrdemDeServico> buscarOrdemPorAparelho(String aparelho) {
         return ordemDeServicoRepository.findByAparelhoContainingIgnoreCase(aparelho);
     }

     public OrdemDeServico enviarOrdem(OrdemDeServico ordem) {
         return ordemDeServicoRepository.save(ordem);
     }

    public OrdemDeServico atualizar(Long id, OrdemDeServico novaOrdem) {
        OrdemDeServico existente = ordemDeServicoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("OS não encontrada"));

        existente.setNome(novaOrdem.getNome());
        existente.setEndereco(novaOrdem.getEndereco());
        existente.setTelefone(novaOrdem.getTelefone());
        existente.setAparelho(novaOrdem.getAparelho());
        existente.setDefeito(novaOrdem.getDefeito());
        existente.setValorPecas(novaOrdem.getValorPecas());
        existente.setValorTotal(novaOrdem.getValorTotal());

        return ordemDeServicoRepository.save(existente);
    }

    public void deletar(Long id) {
        if (!ordemDeServicoRepository.existsById(id)) {
            throw new RuntimeException("OS não encontrada");
        }
        ordemDeServicoRepository.deleteById(id);
    }
}
