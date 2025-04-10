package com.jp.EletronicaOliveira.controller;

import com.jp.EletronicaOliveira.model.OrdemDeServico;
import com.jp.EletronicaOliveira.service.OrdemDeServicoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ordens")
public class OrdemDeServicoController {

    @Autowired
    private OrdemDeServicoService ordemDeServicoService;

    @GetMapping
    public List<OrdemDeServico> listarOrdens() {
        return ordemDeServicoService.listarTodas();
    }

    @GetMapping("/{id}")
    public Optional<OrdemDeServico> listarPorId(@PathVariable Long id) {
        return ordemDeServicoService.buscarOrdemPorId(id);
    }

    @GetMapping("/nome")
    public List<OrdemDeServico> listarPorNome(@RequestParam String nome) {
        return ordemDeServicoService.buscarOrdemPorNome(nome);
    }

    @GetMapping("/telefone")
    public List<OrdemDeServico> listarPorTelefone(@RequestParam String telefone) {
        return ordemDeServicoService.buscarOrdemPorTelefone(telefone);
    }

    @GetMapping("/aparelho")
    public List<OrdemDeServico> listarPorAparelho(@RequestParam String aparelho) {
        return ordemDeServicoService.buscarOrdemPorAparelho(aparelho);
    }

    // Recebe uma nova ordem de serviço via requisição POST,
    // valida os dados e envia para o serviço salvar no banco.
    @PostMapping
    public OrdemDeServico enviarOrdem(@RequestBody @Valid OrdemDeServico ordem) {
        return ordemDeServicoService.enviarOrdem(ordem);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrdemDeServico> atualizarOrdemServico(
            @PathVariable Long id,
            @RequestBody OrdemDeServico novaOrdem) {
        OrdemDeServico atualizada = ordemDeServicoService.atualizar(id, novaOrdem);
        return ResponseEntity.ok(atualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarOrdemServico(@PathVariable Long id) {
        ordemDeServicoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
