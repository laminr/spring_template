package biz.eventual.bearing.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import biz.eventual.bearing.AirportForm;
import biz.eventual.bearing.bean.Airport;
import biz.eventual.bearing.services.IServiceAirportList;

@Controller
@RequestMapping("/airport")
public class AirportController {

	@Autowired
	private IServiceAirportList service;
	
    @RequestMapping(value="/show/{code}", method = RequestMethod.GET)
    public String displayAirport(final ModelMap model, @PathVariable(value="code") final String code) {
        
    	model.addAttribute("code", code);
        
        return "index"; // meaning return to index.jsp
    }
    
    @RequestMapping(value="/list", method = RequestMethod.GET)
    public String airportList(final ModelMap model) {
        final List<Airport> ad = service.searchAirport();
    	
        model.addAttribute("airports", ad);
        
        return "airports"; // meaning return to airports.jsp
    }
    
    @RequestMapping(value="/new-airport", method = RequestMethod.GET)
    public String showCreateForm(final ModelMap model) {
    	
    	if (model.get("createAirport") == null) {
    		model.addAttribute("form", new AirportForm());
    	}
    	return "airport-new";
    }
    
    @RequestMapping(value="/create-new-airport", method = RequestMethod.POST)
    public String create(
    		@Valid
    		@ModelAttribute(value="creation")
    		final AirportForm form, final BindingResult bindingResult, final ModelMap model) {
		
    	String display = "";
    	
    	if ( !bindingResult.hasErrors() ) {
    		final String name = form.getName();
    		final String city = form.getCity();
    		final String iata = form.getIata();
    		final String icao = form.getIcao();
    		
    		display = iata;
    		service.createAirport(name, city, iata, icao);
    	}
    	
    	return displayAirport(model, display);
    }
}