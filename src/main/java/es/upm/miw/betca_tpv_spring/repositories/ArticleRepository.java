package es.upm.miw.betca_tpv_spring.repositories;


import es.upm.miw.betca_tpv_spring.documents.Ad;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Ad, Long> {

}
