package tacos.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import lombok.extern.slf4j.Slf4j;
import tacos.entities.Ingredient;
import tacos.entities.Taco;
import tacos.entities.TacoOrder;
import tacos.enums.Type;
import tacos.repositories.IngredientRepository;
import tacos.services.IngredientService;

@Controller
@Slf4j
@RequestMapping("/design")
@SessionAttributes("tacoOrder")
public class TacoDesignController {

	private IngredientService ingredientService;

	public TacoDesignController(IngredientRepository IngredientRepository, IngredientService ingredientService) {
		this.ingredientService = ingredientService;
	}

	/*
	 * @GetMapping("/") public String home() { return "home"; }
	 */

	@GetMapping
	public String design(Model model) {

		List<Ingredient> ingredients = new ArrayList<>();
		ingredients = ingredientService.getIngredients();
		model.addAttribute("ing", ingredients);
		Type[] types = Type.values();
		for (Type type : types) {
			model.addAttribute(type.toString().toLowerCase(),
					ingredientService.getIngredientsByType(ingredients, type));

		}
		return "design";
	}

	@PostMapping
	public String processTaco(Taco taco, @ModelAttribute TacoOrder tacoOrder) {
		tacoOrder.addTaco(taco);
		log.info("Processing taco: {}", taco);
		return "redirect:/orders/current";
	}

	@ModelAttribute(name = "tacoOrder")
	public TacoOrder order() {
		return new TacoOrder();
	}

	@ModelAttribute(name = "taco")
	public Taco taco() {
		return new Taco();
	}
}
