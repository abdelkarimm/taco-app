package tacos;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import tacos.entities.Ingredient;
import tacos.entities.Taco;
import tacos.enums.Type;
import tacos.repositories.IngredientRepository;
import tacos.repositories.TacoRepository;

@SpringBootApplication
public class TacoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacoAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner dataLoader(IngredientRepository repo,TacoRepository tacoRepo) {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				Ingredient flourTortilla = new Ingredient(
						"FLTO", "Flour Tortilla", Type.WRAP);
						Ingredient cornTortilla = new Ingredient(
						"COTO", "Corn Tortilla", Type.WRAP);
						Ingredient groundBeef = new Ingredient(
						"GRBF", "Ground Beef", Type.PROTEIN);
						Ingredient carnitas = new Ingredient(
						"CARN", "Carnitas", Type.PROTEIN);
						Ingredient tomatoes = new Ingredient(
						"TMTO", "Diced Tomatoes", Type.VEGGIES);
						Ingredient lettuce = new Ingredient(
						"LETC", "Lettuce", Type.VEGGIES);
						Ingredient cheddar = new Ingredient(
						"CHED", "Cheddar", Type.CHEESE);
						Ingredient jack = new Ingredient(
						"JACK", "Monterrey Jack", Type.CHEESE);
						Ingredient salsa = new Ingredient(
						"SLSA", "Salsa", Type.SAUCE);
						Ingredient sourCream = new Ingredient(
						"SRCR", "Sour Cream", Type.SAUCE);
						repo.save(flourTortilla);
						repo.save(cornTortilla);
						repo.save(groundBeef);
						repo.save(carnitas);
						repo.save(tomatoes);
						repo.save(lettuce);
						repo.save(cheddar);
						repo.save(jack);
						repo.save(salsa);
						repo.save(sourCream);
				
				Taco taco1=new Taco();
				taco1.setName("Carnivore");
				taco1.setIngredients(Arrays.asList(
						flourTortilla,groundBeef,carnitas,
						sourCream,salsa,cheddar));
				tacoRepo.save(taco1);
				
				Taco taco2 = new Taco();
				taco2.setName("Bovine Bounty");
				taco2.setIngredients(Arrays.asList(
				cornTortilla, groundBeef, cheddar,
				jack, sourCream));
				tacoRepo.save(taco2);
				
				Taco taco3 = new Taco();
				taco3.setName("Veg-Out");
				taco3.setIngredients(Arrays.asList(
				flourTortilla, cornTortilla, tomatoes,
				lettuce, salsa));
				tacoRepo.save(taco3);
				
				Taco taco4=new Taco();
				taco4.setName("Carnivore");
				taco4.setIngredients(Arrays.asList(
						flourTortilla,groundBeef,carnitas,
						sourCream,salsa,cheddar));
				tacoRepo.save(taco4);
				
				Taco taco5 = new Taco();
				taco5.setName("Bovine Bounty");
				taco5.setIngredients(Arrays.asList(
				cornTortilla, groundBeef, cheddar,
				jack, sourCream));
				tacoRepo.save(taco5);
				
				Taco taco6 = new Taco();
				taco6.setName("Veg-Out");
				taco6.setIngredients(Arrays.asList(
				flourTortilla, cornTortilla, tomatoes,
				lettuce, salsa));
				tacoRepo.save(taco6);
				
				Taco taco7=new Taco();
				taco7.setName("Carnivore");
				taco7.setIngredients(Arrays.asList(
						flourTortilla,groundBeef,carnitas,
						sourCream,salsa,cheddar));
				tacoRepo.save(taco7);
				
				Taco taco8 = new Taco();
				taco8.setName("Bovine Bounty");
				taco8.setIngredients(Arrays.asList(
				cornTortilla, groundBeef, cheddar,
				jack, sourCream));
				tacoRepo.save(taco8);
				
				Taco taco9 = new Taco();
				taco9.setName("Veg-Out");
				taco9.setIngredients(Arrays.asList(
				flourTortilla, cornTortilla, tomatoes,
				lettuce, salsa));
				tacoRepo.save(taco9);
				
				Taco taco10=new Taco();
				taco10.setName("Carnivore");
				taco10.setIngredients(Arrays.asList(
						flourTortilla,groundBeef,carnitas,
						sourCream,salsa,cheddar));
				tacoRepo.save(taco10);
				
				Taco taco11 = new Taco();
				taco11.setName("Bovine Bounty");
				taco11.setIngredients(Arrays.asList(
				cornTortilla, groundBeef, cheddar,
				jack, sourCream));
				tacoRepo.save(taco11);
				
				Taco taco12 = new Taco();
				taco12.setName("Veg-Out");
				taco12.setIngredients(Arrays.asList(
				flourTortilla, cornTortilla, tomatoes,
				lettuce, salsa));
				tacoRepo.save(taco12);
				
				Taco taco13 = new Taco();
				taco13.setName("Bovine Bounty");
				taco13.setIngredients(Arrays.asList(
				cornTortilla, groundBeef, cheddar,
				jack, sourCream));
				tacoRepo.save(taco13);
				
				Taco taco14 = new Taco();
				taco14.setName("Veg-Out");
				taco14.setIngredients(Arrays.asList(
				flourTortilla, cornTortilla, tomatoes,
				lettuce, salsa));
				tacoRepo.save(taco14);
			
			}
		};
	}

}
