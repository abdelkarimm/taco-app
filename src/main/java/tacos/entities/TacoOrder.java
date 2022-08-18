package tacos.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC,force = true)
public class TacoOrder implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private Long id;
	 private String deliveryName;
	 private String deliveryStreet;
	 private String deliveryCity;
	 private String deliveryState;
	 private String deliveryZip;
	 private String ccNumber;
	 private String ccExpiration;
	 private String ccCVV;
	 
	 @OneToMany(cascade = CascadeType.ALL)
	 private List<Taco> tacos = new ArrayList<>();
	 
	 public void addTaco(Taco taco) {
		 this.tacos.add(taco);
	 }

}
