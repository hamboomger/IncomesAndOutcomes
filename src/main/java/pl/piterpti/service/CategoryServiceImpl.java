package pl.piterpti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.piterpti.model.Category;
import pl.piterpti.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public void save(Category category) {
		categoryRepository.save(category);
	}

	@Override
	public Category findByName(String name) {
		return categoryRepository.findByName(name);
	}
	
	

}