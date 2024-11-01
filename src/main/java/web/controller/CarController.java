package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.cars.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;


@Controller
public class CarController {

	@Autowired
	private CarServiceImpl carServiceImpl;



	@GetMapping(value = "/cars")
	public String showCars(ModelMap model, HttpServletRequest request) {



		int countCar = 0;

		String count = request.getParameter("count");


		if (count != null && !count.isEmpty()) {
			countCar = Integer.parseInt(count);
		}

		model.addAttribute("cars", carServiceImpl.getCars(carServiceImpl.setCars (), countCar));

		return "cars";
	}
}