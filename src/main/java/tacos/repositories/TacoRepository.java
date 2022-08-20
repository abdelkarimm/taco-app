package tacos.repositories;


import org.springframework.data.repository.PagingAndSortingRepository;

import tacos.entities.Taco;

public interface TacoRepository extends PagingAndSortingRepository<Taco, Long>  {


}
