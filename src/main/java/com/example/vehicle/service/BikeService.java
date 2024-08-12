package com.example.vehicle.service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.vehicle.dao.BikeDao;
import com.example.vehicle.entity.Bike;

@Service
public class BikeService {
	@Autowired
	BikeDao bd ;
	public String postBike( List<Bike> b) {
		return bd.postBike(b);
	}
	public List<Bike> getBike(){
		return bd.getBike();
	}
	public Bike getBikeId( int a){
		return bd.getBikeId(a);
	}
	public String delete(@PathVariable int a){
		return bd.delete(a);
	}
	public List<Bike> bycolor(String a) {
		List<Bike> bikes = bd.getBike();
		List<Bike> y = bikes.stream().filter(x->x.getColor().equals(a)).collect(Collectors.toList());
		return y;
	}
	public  Bike  minPrice() {
		List<Bike> bikes = bd.getBike();
		Bike y = bikes.stream().min(Comparator.comparingInt(Bike::getPrice)).get();
		return y;
	}
	public List<Bike> bwPrice(int a , int b){
		List<Bike> bikes = bd.getBike();
	List<Bike> y = bikes.stream().filter(x->x.getPrice()>a&& x.getPrice()<b).collect(Collectors.toList());
	return y;
	}
	
	public Map<String, Long> group() {
		List<Bike> bikes = bd.getBike();
		return bikes.stream().collect(Collectors.groupingBy(Bike:: getColor,Collectors.counting()));
			
		}
	public float avg() {
		return bd.avg();
	}
	public List<Bike> sort(){
		return bd.sort();
	}
	public List<Bike> greaterThanAvg(){
		return bd.greaterThanAvg();
	}
	public List<Bike> topThree() {
		return bd.topThree();
	}
	public List<Bike> sortByColor() {
		return bd.sortByColor();
	}
	public int sumOfPrice() {
		return bd.sumOfPrice();
	}
	public float twoDecimal() {
		// TODO Auto-generated method stub
		return bd.twoDecimal();
	}
	public List<Bike> filterAndSort(String a) {
		// TODO Auto-generated method stub
		return bd.filterAndSort(a);
	}
	public List<Object> groupbyBoth() {
		// TODO Auto-generated method stub
		return bd.groupbyBoth();
	}
	public Bike last() {
		// TODO Auto-generated method stub
		return bd.last();
	}
	}

