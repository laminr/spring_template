package biz.eventual.bearing.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="airport")
public class Airport {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
	private int airportId	= 0;
    private String name 	= "";
	private String city 	= "";
	private String country 	= "";
	private String iata 	= "";
	private String icao 	= "";
	private double latitude = 0.0;
	private double longitude = 0.0;

	/*
	private String dst;
	private int altitude;
	private BigDecimal timeZone;
	*/
	
	public Airport() {}

	public int getId() {
		return this.airportId;
	}

	public void setId(int airportId) {
		this.airportId = airportId;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getIata() {
		return this.iata;
	}

	public void setIata(String iata) {
		this.iata = iata;
	}


	public String getIcao() {
		return this.icao;
	}

	public void setIcao(String icao) {
		this.icao = icao;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String toString() {
		//Gson gson = new Gson();
		return ""; // gson.toJson(this);
	}
	
	/*
	public String getDst() {
		return this.dst;
	}

	public void setDst(String dst) {
		this.dst = dst;
	}

	public BigDecimal getTimeZone() {
		return this.timeZone;
	}

	public void setTimeZone(BigDecimal timeZone) {
		this.timeZone = timeZone;
	}


	public int getAltitude() {
		return this.altitude;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
	 */


	public final class Att {
		public static final String ID = "airport_id";
		public static final String CITY = "city";
		public static final String COUNTRY = "country";
		public static final String IATA = "iata";
		public static final String ICAO = "icao";
		public static final String LATITUDE = "latitude";
		public static final String LONGITUDE = "longitude";
		public static final String NAME = "name";
		
		/*
		public static final String ALTITUDE = "altitude";
		public static final String DST = "dst";
		public static final String TIME_ZONE = "timeZone";
		*/
	}
}