package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import domain.Marvel;

@RestController
public class MarvelController  {
	
	private List<Marvel> marvelList = new ArrayList<>();
	
	
	//CRUD
	
	//CREATE
	@PostMapping("/create")
	public void createCharacter(@RequestBody Marvel marvel) {
		this.marvelList.add(marvel);
	}
	
	//READ
	@GetMapping("/getMarvel")
	public List<Marvel> getMarvel(){
		return this.marvelList;
	}
	
	
	

}
