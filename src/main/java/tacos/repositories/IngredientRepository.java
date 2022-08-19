package tacos.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tacos.entities.Ingredient;


public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
