package com.example.vehicle.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.vehicle.entity.Bike;
import com.example.vehicle.service.BikeService;

@RestController
public class BikeController {
	@Autowired
	BikeService bs;

	 @PostMapping(value = "/postbike")
	public String postBike(@RequestBody List<Bike> b) {
		return bs.postBike(b);
	}

	@GetMapping(value = "/getbike")
	public List<Bike> getBike() {
		return bs.getBike();
	}

	@GetMapping(value = "/getbike/{a}")
	public Bike getBikeId(@PathVariable int a) {
		return bs.getBikeId(a);
	}

	@GetMapping(value = "/delete/{a}")
	public String delete(@PathVariable int a) {
		return bs.delete(a);
	}
	@GetMapping(value = "/getbycolor/{a}")
	public List<Bike> bycolor(@PathVariable String a) {
		return bs.bycolor(a);
	}
	@GetMapping(value = "/getminprice")
	public Bike minPrice() {
		return bs.minPrice();
	}
	@GetMapping(value = "/getbw/{a}/{b}")
	public List<Bike> bwPrice(@PathVariable int a ,@PathVariable int b){
		return bs.bwPrice(a, b);
	}
	@GetMapping(value = "/group")
	public Map<String, Long> group() {
		return bs.group();
		
		
	}
	//task 2
	@GetMapping(value = "/avg")
	public float avg() {
		return bs.avg();
	}
	//task3
	@GetMapping(value="/sort")
	public List<Bike> sort(){
		return bs.sort();
	}
	@GetMapping(value="/greaterThanAvg")
	public List<Bike> greaterThanAvg(){
		return bs.greaterThanAvg();
	}
	@GetMapping(value="/topthree")
	public List<Bike> topThree(){
		return bs.topThree();
	
	}
	// task 6  price >5000 and sort by color 
	@GetMapping(value="/sortByColor")
	public List<Bike> sortByColor(){
		return bs.sortByColor();
	}
	//task7
	@GetMapping(value="/groupbyBoth")
	public List<Object> groupbyBoth(){
		return bs.groupbyBoth();
	
	}
	//task8
	@GetMapping(value="/sumOfPrice")
	public int sumOfPrice() {
		return bs.sumOfPrice();
	}
	@GetMapping(value="/twoDecimal")
	public float twoDecimal() {
		return bs.twoDecimal() ;
	}
	@GetMapping(value="/filterAndSort/{a}")
	public List<Bike> filterAndSort(@PathVariable String a){
		return bs.filterAndSort(a);
	}
	@GetMapping(value="/last")
	public Bike last() {
		return bs.last();
	}
}
