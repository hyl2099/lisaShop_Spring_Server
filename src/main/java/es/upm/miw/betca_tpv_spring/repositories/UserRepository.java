package es.upm.miw.betca_tpv_spring.repositories;

import es.upm.miw.betca_tpv_spring.documents.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, String> {

    Optional<User> findByMobile(String mobile);

//    @Query(value = "{}", fields = "{ '_id' : 0, 'mobile' : 1, 'username' : 1}")
//    List<UserMinimumDto> findAllUsers();


}
