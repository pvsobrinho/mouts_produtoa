package com.example.mouts_produtoa.produto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProdutoAService {

    private final KafkaTemplate<String, ProdutoRequest> kafkaTemplate;

    @Value("${kafka.topic.produtoA}")
    String kafkaTopic;

    public ProdutoAService(KafkaTemplate<String, ProdutoRequest> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void enviarProduto(ProdutoRequest produtoRequest) {
        kafkaTemplate.send(kafkaTopic, produtoRequest);
    }
}
