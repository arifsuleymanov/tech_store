package az.atlacademy.tech_store.tech_store.repository;

import az.atlacademy.tech_store.tech_store.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long>{
}
