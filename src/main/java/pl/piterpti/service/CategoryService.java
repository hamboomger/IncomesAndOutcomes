package pl.piterpti.service;

import java.util.List;

import pl.piterpti.model.Category;

/**
 * Service for Outcomes categories
 * 
 * @author piter
 *
 */
public interface CategoryService {

	public List<Category> findAll();
	
	public void save(Category category);
	
	public Category findByName(String name);
	
	public void deleteAll();
	
	public Category findById(long id);
	
	public void update(Category category);
	
	public Category findUserCategoryByName(String login, String category);
	
	public List<Category> findUserCategories(String login);
	
	public List<Category> findUserActiveCategories(String login);
}
