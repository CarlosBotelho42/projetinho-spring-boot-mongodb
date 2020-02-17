package Projetinho.SBMDB.ProjetinhoSBMDB.resources;

import Projetinho.SBMDB.ProjetinhoSBMDB.domain.user;
import Projetinho.SBMDB.ProjetinhoSBMDB.dto.userDTO;
import Projetinho.SBMDB.ProjetinhoSBMDB.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<userDTO>> findAll(){

        List<user> list = service.findAll();
        List<userDTO> listDTO = list.stream().map(x -> new userDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);

    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<userDTO> findById(@PathVariable String id){

        user obj = service.findById(id);
        return ResponseEntity.ok().body(new userDTO(obj));

    }

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody userDTO objDTO) {

        user obj = service.fromDTO(objDTO);
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();

    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id){

        service.delete(id);
        return ResponseEntity.noContent().build();

    }


}
