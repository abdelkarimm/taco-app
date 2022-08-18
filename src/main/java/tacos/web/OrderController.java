package tacos.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import tacos.entities.TacoOrder;
import tacos.repositories.OrderRepository;


@Controller
@RequestMapping("/orders")
@SessionAttributes("tacoOrder")
public class OrderController {
	
	OrderRepository orderRepo;
	
	public OrderController(OrderRepository orderRepo) {
		this.orderRepo = orderRepo;
	}

	@GetMapping("/current")
	public String orderForm() {
		
	return "orderForm";
	}
	
	@PostMapping
	public String processOrder(@ModelAttribute TacoOrder tacoOrder,SessionStatus sessionStatus) {
		
	    orderRepo.save(tacoOrder);
	    sessionStatus.setComplete();
		return "redirect:/";
	}
}
