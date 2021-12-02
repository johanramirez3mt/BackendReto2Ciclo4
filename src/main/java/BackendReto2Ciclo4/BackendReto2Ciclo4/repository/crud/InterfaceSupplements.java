package BackendReto2Ciclo4.BackendReto2Ciclo4.repository.crud;

import BackendReto2Ciclo4.BackendReto2Ciclo4.model.Supplements;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InterfaceSupplements extends MongoRepository<Supplements, String> {
    
}
