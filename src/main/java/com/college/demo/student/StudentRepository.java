package com.college.demo.student;

import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
	
	Optional<Student> findStudentByEmail(String email);
	
	@Modifying
	 @Query("UPDATE student SET name = :name WHERE id = :id")
	 boolean updateByName(@Param("id") Long id, @Param("name") String name);
	 
	 @Modifying
	 @Query("UPDATE student SET email = :email WHERE id = :id")
	 boolean updateByEmail(@Param("id") Long id, @Param("email") String email);

}
