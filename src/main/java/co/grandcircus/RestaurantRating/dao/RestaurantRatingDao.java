package co.grandcircus.RestaurantRating.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import co.grandcircus.RestaurantRating.entity.Restaurant;

public interface RestaurantRatingDao extends JpaRepository<Restaurant, Long>{
	
	List<Restaurant> findAllByOrderByRatingDesc();

}
