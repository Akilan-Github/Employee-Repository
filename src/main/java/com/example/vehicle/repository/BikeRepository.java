package com.example.vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.vehicle.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike, Integer> {
	//task 2: using jquery
	@Query(value="select avg(b.price) from Bike b ")
	public float avg();
	//task 3 Jquery
	@Query(value="select b from Bike b  order by b.color,b.price")
	public List<Bike> sort();
	//task 4
	
	@Query(value="select * from bike where price>(select avg(price) from bike);", nativeQuery= true)
	public List<Bike> greaterThanAvg();
	
	//task5
	@Query(value="select b from Bike b  order by b.price desc limit 3")
	public List<Bike> topThree();
	
	//task 6
	@Query(value="select b from Bike b where b.price>50000 order by b.color")
	public List<Bike> sortByColor();
	//task 7 
	@Query(value="SELECT color, price, count(*)  FROM bike group by color, price ", nativeQuery= true)
	public List<Object> groupbyBoth();
	
	//task 8 sum of price
	@Query(value="select sum(b.price) from Bike b ")
	public int sumOfPrice();
	//task 9
	@Query(value="select round(avg(price),2) from bike", nativeQuery= true)
	public float twoDecimal();
	
	@Query(value="select * from bike where color=? order by brand;", nativeQuery= true)
	public List<Bike> filterAndSort(String a);
	
	@Query(value="select * from bike where color = 'black' order by slno desc limit 1",nativeQuery=true)
	public Bike last();
	
	
	
}
