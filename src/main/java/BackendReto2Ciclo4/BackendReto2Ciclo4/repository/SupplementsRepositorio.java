package BackendReto2Ciclo4.BackendReto2Ciclo4.repository;

import BackendReto2Ciclo4.BackendReto2Ciclo4.model.Supplements;
import BackendReto2Ciclo4.BackendReto2Ciclo4.repository.crud.InterfaceSupplements;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SupplementsRepositorio {
    @Autowired
    private InterfaceSupplements repository;

    public List<Supplements> getAll() {
        return repository.findAll();
    }

    public Optional<Supplements> getClothe(String reference) {
        return repository.findById(reference);
    }
    public Supplements create(Supplements clothe) {
        return repository.save(clothe);
    }

    public void update(Supplements clothe) {
        repository.save(clothe);
    }
    
    public void delete(Supplements clothe) {
        repository.delete(clothe);
    }
}
