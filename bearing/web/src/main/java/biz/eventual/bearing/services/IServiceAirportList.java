package biz.eventual.bearing.services;

import java.util.List;
import biz.eventual.bearing.bean.Airport;

public interface IServiceAirportList {

	List<Airport> searchAirport();
	
	void createAirport(final String name, String city, String iata, String icao);
}
