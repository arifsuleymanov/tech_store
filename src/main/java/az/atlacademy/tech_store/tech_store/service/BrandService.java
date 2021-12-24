package az.atlacademy.tech_store.tech_store.service;

import az.atlacademy.tech_store.tech_store.entity.Brand;
import az.atlacademy.tech_store.tech_store.repository.BrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BrandService {
    private final BrandRepository brandRepository;

    public List<Brand> findAll(){
        return brandRepository.findAll();
    }

    public Brand findById(Long id){
        return brandRepository.findById(id).get();
    }

    public Brand save(Brand brand){
        return brandRepository.save(brand);
    }

    public void delete(Long id){
        Brand brandForDelete = brandRepository.findById(id).get();
        brandRepository.delete(brandForDelete);
    }

    public Brand update(Brand brand){
        Brand brandForUpdate = brandRepository.findById(brand.getId()).get();

        brandForUpdate.setName(brand.getName());

        return brandRepository.save(brandForUpdate);
    }



}
