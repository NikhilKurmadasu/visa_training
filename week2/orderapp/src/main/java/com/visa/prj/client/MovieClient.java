package com.visa.prj.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.visa.prj.dao.MovieDao;
import com.visa.prj.entity.Actor;
import com.visa.prj.entity.Movie;

public class MovieClient {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.scan("com.visa");
		ctx.refresh();
		
		MovieDao dao=ctx.getBean("movieDaoJpaImpl",MovieDao.class);
		
		Movie m=dao.getMovie(2);
		Actor a1=dao.getActor(1);
		Actor a2=dao.getActor(2);
		m.getActors().add(a1);
		m.getActors().add(a2);
		
		dao.assignActorsMovie(m);
//		Actor a1=new Actor();
//		a1.setName("Uma Thurman");
//		
//		Actor a2= new Actor();
//		a2.setName("Travlota");
//		
//		Movie m1=new Movie();
//		m1.setName("Kill Bill 1");
//		
//		Movie m2=new Movie();
//		m2.setName("Pulp Fiction");
//		
//		dao.addActor(a1);
//		dao.addActor(a2);
//		dao.addMovie(m1);
//		dao.addMovie(m2);
	}

}
