package redcompa.project.models.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import redcompa.project.models.entities.UserModel;

public interface IUserRepository extends JpaRepository<UserModel, Long> {
		public List<UserModel> findAll();
		public UserModel findByName(String name);
	

}
