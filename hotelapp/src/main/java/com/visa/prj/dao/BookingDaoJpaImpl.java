package com.visa.prj.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.visa.prj.entity.Booking;
import com.visa.prj.entity.Hotel;
import com.visa.prj.entity.User;

@Repository
public class BookingDaoJpaImpl implements BookingDao {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<Hotel> findHotels(String criteria) {
		
		TypedQuery<Hotel> query= em.createQuery("from Hotel where name = :c",Hotel.class);
		query.setParameter("c",criteria);
		return query.getResultList();
	}

	@Override
	public Hotel findHotelById(long id) {
		TypedQuery<Hotel> query=em.createQuery("from Hotel where hotel_id=:hotel_id",Hotel.class);
		query.setParameter("hotel_id", id);
		return query.getSingleResult();
	}

	@Override
	public User getUser(String email, String password) {
		TypedQuery<User> query= em.createQuery("from User where email = :e and password = :p",User.class);
		query.setParameter("e",email);
		query.setParameter("p", password);
		return query.getResultList().get(0);
	}

	@Override
	public long createBooking(Booking booking) {
		 em.persist(booking);
		 return booking.getId();
	}

	@Override
	public List<Booking> getAllBookingsOfUser(User user) {
		String s=user.getUsername();
		TypedQuery<Booking> query=(TypedQuery<Booking>) em.createQuery("from Booking b where b.user_id=:s");
		query.setParameter("s", user.getUsername());
		return query.getResultList();
	}

}
