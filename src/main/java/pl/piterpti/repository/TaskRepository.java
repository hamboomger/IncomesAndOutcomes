package pl.piterpti.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pl.piterpti.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
	
	/**
	 * Get all user tasks with passed limit
	 * @param login user login
	 * @param count limit
	 * @return user tasks
	 */
	@Query("SELECT t FROM User u JOIN u.tasks t WHERE u.login = :login")
	public List<Task> getUserTasksWithLimit(@Param("login") String login, Pageable pageable);
	
	/**
	 * Get all user tasks in passed date
	 * @param login user login
	 * @param date date
	 * @return user tasks in date
	 */
	@Query("SELECT t FROM User u JOIN u.tasks t WHERE u.login = :login AND t.date = :date")
	public List<Task> getUserTasksInDate(@Param("login") String login, @Param("date") Date date);
	
	/**
	 * Get all user tasks in date period
	 * @param login user login
	 * @param fromDate from date
	 * @param toDate to date
	 * @return user tasks
	 */
	@Query("SELECT t FROM User u JOIN u.tasks t WHERE u.login = :login AND t.date >= :fromDate AND t.date <= :toDate")
	public List<Task> getUserTasksInDatePeriod(@Param("login") String login, @Param("fromDate") Date fromDate, @Param("toDate") Date toDate);
	
}