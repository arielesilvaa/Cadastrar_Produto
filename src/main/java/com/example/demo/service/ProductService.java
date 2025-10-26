package com.example.demo.service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Camada de serviço. @Service marca componente de lógica de negócio.
 */
@Service
public class ProductService {

    private final ProductRepository repository;

    // Injeção por construtor (recomendada)
    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product create(Product p) {
        return repository.save(p);
    }

    public Product update(Long id, Product p) {
        Product existing = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Produto não encontrado: " + id));
        existing.setName(p.getName());
        existing.setDescription(p.getDescription());
        existing.setPrice(p.getPrice());
        return repository.save(existing);
    }

    public Product getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Produto não encontrado: " + id));
    }

    public List<Product> getAll() {
        return repository.findAll();
    }

    public void delete(Long id) {
        repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Produto não encontrado: " + id));
        repository.deleteById(id);
    }
}

