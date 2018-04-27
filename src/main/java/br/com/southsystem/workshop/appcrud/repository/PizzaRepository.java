package br.com.southsystem.workshop.appcrud.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.southsystem.workshop.appcrud.domain.Pizza;
import br.com.southsystem.workshop.appcrud.enumerators.Size;

@Repository
public interface PizzaRepository extends MongoRepository<Pizza, String> {

    public List<Pizza> findBySize(Size size, Pageable pageable);

    public List<Pizza> findBySizeAndFlavours(Size size, List<String> flavours);

}














