package tacos.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import tacos.entities.Ingredient;
import tacos.enums.Type;
import tacos.repositories.IngredientRepository;

@Service
public class IngredientServiceImpl  implements IngredientService{

	private IngredientRepository ingredientRepository;
	
	 public IngredientServiceImpl(IngredientRepository ingredientRepository) {

		 this.ingredientRepository = ingredientRepository;	
		 }
	
	@Override
	public List<Ingredient> getIngredients(){
		
		List<Ingredient> ingredients = new ArrayList<>();
		
		ingredientRepository.findAll().forEach(e -> ingredients.add(e));
		
		return ingredients;
	}


	@Override
	public List<Ingredient> getIngredientsByType(List<Ingredient> ingredients,Type type) {
		
		return ingredients.stream()
							   .filter(e -> e.getType().equals(type))
							   .collect(Collectors.toList());
		
	}
}
