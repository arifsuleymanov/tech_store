package az.atlacademy.tech_store.tech_store.service;

import az.atlacademy.tech_store.tech_store.entity.Model;
import az.atlacademy.tech_store.tech_store.repository.ModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ModelService {
    private final ModelRepository modelRepository;

    public List<Model> findAll(){
        return modelRepository.findAll();
    }

    public Model findById(Long id){
        return modelRepository.findById(id).get();
    }

    public Model save(Model Model){
        return modelRepository.save(Model);
    }

    public void delete(Long id){
        Model modelForDelete = modelRepository.findById(id).get();
        modelRepository.delete(modelForDelete);
    }

    public Model update(Model model){
        Model modelForUpdate = modelRepository.findById(model.getId()).get();

        modelForUpdate.setName(model.getName());
        modelForUpdate.setType(model.getType());
        modelForUpdate.setBrand(model.getBrand());

        return modelRepository.save(modelForUpdate);
    }
}
