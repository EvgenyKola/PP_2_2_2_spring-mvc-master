package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.cars.CService;
import web.cars.Cars;
import javax.servlet.http.HttpServletRequest;
import java.util.LinkedList;
import java.util.List;



@Controller
public class CarController {

	@Autowired
	private CService cservice;



	@GetMapping(value = "/cars")
	public String showCars(ModelMap model, HttpServletRequest request) {

		List <Cars> cars = new LinkedList<>();

		int countCar = 0;

		String count = request.getParameter("count");

		cars.add(new Cars("Toyota", "Camry", 2022));
		cars.add(new Cars("Acura", "TLX", 2020));
		cars.add(new Cars("Honda", "Accord", 2019));
		cars.add(new Cars("BMX", "X3", 2020));
		cars.add(new Cars("Lada", "Vesta", 2022));

		if (count != null && !count.isEmpty()) {
			countCar = Integer.parseInt(count);
		}

		model.addAttribute("cars", cservice.getCars(cars, countCar));

		return "cars";
	}
}