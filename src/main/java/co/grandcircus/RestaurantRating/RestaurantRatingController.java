package co.grandcircus.RestaurantRating;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.RestaurantRating.dao.RestaurantRatingDao;
import co.grandcircus.RestaurantRating.entity.Restaurant;

@Controller
public class RestaurantRatingController {

	@Autowired
	RestaurantRatingDao dao;
	
	@RequestMapping("/")
	public ModelAndView index() {
		List<Restaurant> sortedRestaurants = dao.findAllByOrderByRatingDesc();
		return new ModelAndView("index", "restaurants", sortedRestaurants);
	}
	
	@RequestMapping("/upVote")
	public ModelAndView upVote(@RequestParam("id") Long id) {
		Restaurant upRestaurant =  dao.getOne(id);
		upRestaurant.setRating(upRestaurant.getRating() + .1);
		dao.save(upRestaurant);
		return new 	ModelAndView("redirect:/");	
	}
	
	@RequestMapping("/downVote")
	public ModelAndView downVote(@RequestParam("id") Long id) {
		Restaurant upRestaurant =  dao.getOne(id);
		upRestaurant.setRating(upRestaurant.getRating() - .1);
		dao.save(upRestaurant);
		return new 	ModelAndView("redirect:/");	
	}
}
