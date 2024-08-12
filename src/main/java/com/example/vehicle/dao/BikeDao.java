package com.example.vehicle.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.vehicle.entity.Bike;
import com.example.vehicle.repository.BikeRepository;

@Repository
public class BikeDao {
	@Autowired
	BikeRepository br;
	public String postBike(List<Bike> b) {
		br.saveAll(b);
		return "posted successfully";
		
		
	}
	public List<Bike> getBike(){
		return br.findAll();
	}
	public Bike getBikeId( int a){
		return br.findById(a).get();
	}
	public String delete(int a){
		 br.deleteById(a);
		 return "deleted successfully";
	}
	
	public float avg() {
		return br.avg();
	}
	public List<Bike> sort(){
		return br.sort();
	}
	public List<Bike> greaterThanAvg(){
		return br.greaterThanAvg();
	}
	public List<Bike> topThree() {
		return br.topThree();
	}
	public List<Bike> sortByColor() {
		return br.sortByColor();
	}
	public int sumOfPrice() {
		return br.sumOfPrice();
	}
	public float twoDecimal() {
		return br.twoDecimal();
	}
	public List<Bike> filterAndSort(String a) {
		// TODO Auto-generated method stub
		return br.filterAndSort(a);
	}
	public List<Object> groupbyBoth() {
		// TODO Auto-generated method stub
		return br.groupbyBoth();
	}
	public Bike last() {
		// TODO Auto-generated method stub
		return br.last();
	}
}
