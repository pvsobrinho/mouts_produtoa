package com.example.mouts_produtoa.produto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto-a")
public class ProdutoAController {

    private final ProdutoAService produtoAService;

    public ProdutoAController(ProdutoAService produtoAService) {
        this.produtoAService = produtoAService;
    }

    @PostMapping("/enviar")
    public ResponseEntity<String> enviarProduto(@RequestBody ProdutoRequest produtoRequest) {
        produtoAService.enviarProduto(produtoRequest);
        return ResponseEntity.ok("Produto enviado com sucesso");
    }
}

