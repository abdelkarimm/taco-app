package tacos.services;

import java.util.List;

import tacos.entities.Ingredient;
import tacos.enums.Type;

public interface IngredientService {
	
	public List<Ingredient> getIngredients();
	
	public List<Ingredient> getIngredientsByType(List<Ingredient> ingredients,Type type);

}
