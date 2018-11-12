package thangnd15.dao;

import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import thangnd15.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public Student getStudent() {
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query
//		Query<Student> theQuery = 
//				currentSession.createQuery("from thangnd15_database.student", Student.class);
		
		Student student = currentSession.get(Student.class, 35);
		
		// execute query and get result list
		//List<Student> students = theQuery.getResultList();
				
		// return the results		
		return student;
	}
	
}
