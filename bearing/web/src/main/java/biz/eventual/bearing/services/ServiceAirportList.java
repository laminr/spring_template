package biz.eventual.bearing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import biz.eventual.bearing.bean.Airport;
import biz.eventual.bearing.dao.IAirportListDAO;

@Service
public class ServiceAirportList implements IServiceAirportList {
	
	@Autowired
	private IAirportListDAO dao;
	
	@Transactional(readOnly=true)
	public List<Airport> searchAirport() {
		// TODO Auto-generated method stub
		return dao.searchAirport();
	}

	@Transactional
	public void createAirport(String name, String city, String iata, String icao) {
		
		final Airport airport = new Airport();
		
		airport.setCity(name);
		airport.setCity(city);
		airport.setCity(iata);
		airport.setCity(icao);
		
		dao.createAirport(airport);
		
	}

}
