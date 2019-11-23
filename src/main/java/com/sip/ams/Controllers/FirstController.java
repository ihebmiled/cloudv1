package com.sip.ams.Controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.sip.ams.Entities.Animale;

@Controller
public class FirstController {

	@GetMapping("/home")
	//@ResponseBody //Reponse dans le body -- ou bien dans le view
	
	
	public String home() {
		//return "<h1 align=center> Hello Spring Boot</h1>";  //1ere methode
		return"/first/home";
	}
	
	@GetMapping("/acceuil")
	public String acceuil(@RequestParam(required=false,defaultValue="Spring Boot") String framework ,@RequestParam(required=false,defaultValue="1.0")String version,ModelMap monObj){
		String msg="Vous avez choisi--->"+framework;
		String msg1=" et la version-->"+version;
		
		String ecole="Plytech";
		String formation="Formation Spring & Angular";
		int tab1[]= {1,2,3};
		ArrayList<String> names=new ArrayList<String>();
		names.add("iheb");
		names.add("bassem");
		names.add("mikel");	
		
	ArrayList<Animale> animals=new ArrayList<>();
			
	animals.add(new Animale("dog", 14));
	animals.add(new Animale("cat", 56));
	
		monObj.put("ec",ecole);
		monObj.put("forma",formation);
		monObj.put("tab",tab1);
		monObj.put("names",names);
		monObj.put("animals",animals);
		monObj.put("msg",msg);
		monObj.put("msg1",msg1);
		return"/first/acceuil";
	} 
}
