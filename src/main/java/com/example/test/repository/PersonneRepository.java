/**
 * 
 */
package com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.model.Personne;

/**
 * @author miaro
 *
 */
public interface PersonneRepository extends JpaRepository<Personne, Integer> {

}
