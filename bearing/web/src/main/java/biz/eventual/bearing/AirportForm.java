package biz.eventual.bearing;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class AirportForm {
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	@Pattern(regexp="[A-Za-z]{4}")
	private String icao;
	
	@NotEmpty
	@Pattern(regexp="[A-Za-z]{4}")
	private String iata;
	
	@NotEmpty
	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcao() {
		return icao;
	}

	public void setIcao(String icao) {
		this.icao = icao;
	}

	public String getIata() {
		return iata;
	}

	public void setIata(String iata) {
		this.iata = iata;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
