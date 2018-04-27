package br.com.southsystem.workshop.appcrud.service;

import br.com.southsystem.workshop.appcrud.domain.Pizza;
import br.com.southsystem.workshop.appcrud.repository.PizzaRepository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PizzaService {
    private final PizzaRepository pizzaRepository;

    public PizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }
    
    public Page<Pizza> listAllByPage(Pageable pageable) {
    	return pizzaRepository.findAll(pageable);
	}
    
    public Pizza save(Pizza pizza){
        return pizzaRepository.save(pizza);
    }
    
    public Pizza findOne(String id){
        return pizzaRepository.findOne(id);
    }

	public List<Pizza> findAll() {
		return pizzaRepository.findAll();
	}

	public void deleteOne(String id) {
		pizzaRepository.delete(id);
	}
}
