package biz.eventual.bearing.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import biz.eventual.bearing.bean.Airport;

@Repository
public class AirportListDAO implements IAirportListDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Airport> searchAirport() {
		
		final CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		final CriteriaQuery<Airport> criteriaQuery = criteriaBuilder.createQuery(Airport.class);
		final Root<Airport> root = criteriaQuery.from(Airport.class);
		
		criteriaQuery.select(root);
		final TypedQuery<Airport> typedQuery = entityManager.createQuery(criteriaQuery);
		
		return typedQuery.getResultList();
	}

	public void createAirport(Airport airport) {
		entityManager.persist(airport);
	}

}
