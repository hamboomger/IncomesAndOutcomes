package pl.piterpti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.piterpti.model.Role;

/**
 * 
 * Role repository
 * 
 * @author Piter
 *
 */
@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Long> {

	public Role findByRole(String role);
	
}
