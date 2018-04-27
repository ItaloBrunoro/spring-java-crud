package br.com.southsystem.workshop.appcrud.rest;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.southsystem.workshop.appcrud.domain.Pizza;
import br.com.southsystem.workshop.appcrud.service.PizzaService;

@RestController
@RequestMapping("/pizza")
public class PizzaResource {
    private final PizzaService pizzaService;

    public PizzaResource(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @PostMapping
    public ResponseEntity<Pizza> save(@RequestBody Pizza pizza) {
        return ResponseEntity.ok(pizzaService.save(pizza));
    }
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<Pizza> getOne(@PathVariable("id") String id) {
        return ResponseEntity.ok(pizzaService.findOne(id));
    }
    
    @GetMapping
    public ResponseEntity<Page<Pizza>> getAll(Pageable pageable) {
//    	PageRequest page_req = new PageRequest(0, 2, Direction.DESC, "id");
        return ResponseEntity.ok(pizzaService.listAllByPage(pageable));
    }
    
    @DeleteMapping(value = "/{id}")
    public void deleteOne(@PathVariable("id") String id) {
    	pizzaService.deleteOne(id);
    	ResponseEntity.ok(HttpStatus.OK);   	
    }
}
