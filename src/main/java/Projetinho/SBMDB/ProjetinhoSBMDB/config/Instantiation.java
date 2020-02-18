package Projetinho.SBMDB.ProjetinhoSBMDB.config;

import Projetinho.SBMDB.ProjetinhoSBMDB.domain.Post;
import Projetinho.SBMDB.ProjetinhoSBMDB.domain.user;
import Projetinho.SBMDB.ProjetinhoSBMDB.dto.AuthorDTO;
import Projetinho.SBMDB.ProjetinhoSBMDB.repositiry.PostRepository;
import Projetinho.SBMDB.ProjetinhoSBMDB.repositiry.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();
        postRepository.deleteAll();

        user maria = new user(null, "Maria Brown", "maria@gmail.com");
        user alex = new user(null, "Alex Green", "alex@gmail.com");
        user bob = new user(null, "Bob Grey", "bob@gmail.com");

        userRepository.saveAll(Arrays.asList(maria,alex,bob));

        Post post1 = new Post(null, sdf.parse("25/05/2019"), "Partiu niver", "Vais er meu niver. pode brotar!", new AuthorDTO( maria));
        Post post2 = new Post(null, sdf.parse("30/05/2019"), "Acabou o niver :c", "Passou 5 dias de festa. Estou morto!!!", new AuthorDTO(maria));

        postRepository.saveAll(Arrays.asList(post1,post2));

    }
}
