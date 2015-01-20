package biz.eventual.bearing.dao;

import java.util.List;

import biz.eventual.bearing.bean.Airport;

public interface IAirportListDAO {
	
	List<Airport> searchAirport();
	
	void createAirport(final Airport airport);
}
