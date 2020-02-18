package Projetinho.SBMDB.ProjetinhoSBMDB.repositiry;

import Projetinho.SBMDB.ProjetinhoSBMDB.domain.Post;
import Projetinho.SBMDB.ProjetinhoSBMDB.domain.user;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
