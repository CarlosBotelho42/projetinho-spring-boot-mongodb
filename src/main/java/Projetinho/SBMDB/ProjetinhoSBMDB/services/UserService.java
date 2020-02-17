package Projetinho.SBMDB.ProjetinhoSBMDB.services;

import Projetinho.SBMDB.ProjetinhoSBMDB.domain.user;
import Projetinho.SBMDB.ProjetinhoSBMDB.dto.userDTO;
import Projetinho.SBMDB.ProjetinhoSBMDB.repositiry.UserRepository;
import Projetinho.SBMDB.ProjetinhoSBMDB.services.exceptions.IDNFEX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<user> findAll(){

        return repo.findAll();

    }

    public user findById(String id){

        Optional<user> obj = repo.findById(id);
        return obj.orElseThrow(() -> new IDNFEX("Id não encontrado"));

    }

    public user insert(user obj){

        return  repo.insert(obj);

    }

    public void delete(String id){
        findById(id);
        repo.deleteById(id);

    }


    public user fromDTO(userDTO objDTO){

        return new user(objDTO.getId(), objDTO.getName(), objDTO.getEmail());

    }



}
