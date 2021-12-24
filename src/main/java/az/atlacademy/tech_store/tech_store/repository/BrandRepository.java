package az.atlacademy.tech_store.tech_store.repository;

import az.atlacademy.tech_store.tech_store.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long>{
}
