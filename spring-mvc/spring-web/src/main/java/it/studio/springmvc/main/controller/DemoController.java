package it.studio.springmvc.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * ho dovuto aggiungere il package con i controller allo springmvc-servlet.xml, in modo che SpringMVC li potesse
 * riconoscere e caricare.
 */
@Controller
public class DemoController {

	@RequestMapping(value="/home")
	public String getIndex() {
		System.out.println("Chiamata home");
		return "index";
	}
	
	@RequestMapping(value="/demo/{testo}", method=RequestMethod.GET)
	public void getTestoServizio(@PathVariable("testo") String testo) {
		System.out.println("Testo trasmesso: " + testo);
	}
}
