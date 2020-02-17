package Projetinho.SBMDB.ProjetinhoSBMDB.repositiry;

import Projetinho.SBMDB.ProjetinhoSBMDB.domain.user;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<user, String> {

}
