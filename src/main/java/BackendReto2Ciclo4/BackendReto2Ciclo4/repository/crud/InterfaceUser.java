package BackendReto2Ciclo4.BackendReto2Ciclo4.repository.crud;

import BackendReto2Ciclo4.BackendReto2Ciclo4.model.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InterfaceUser extends MongoRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
}
