package es.upm.miw.betca_tpv_spring.repositories;

import es.upm.miw.betca_tpv_spring.documents.SearchHistory;
import org.springframework.data.repository.CrudRepository;

public interface SearchHistoryRepository extends CrudRepository<SearchHistory, Long> {
}
