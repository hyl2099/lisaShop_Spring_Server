package es.upm.miw.betca_tpv_spring.repositories;

import es.upm.miw.betca_tpv_spring.documents.Setting;
import org.springframework.data.repository.CrudRepository;

public interface SettingRepository extends CrudRepository<Setting, Long> {
}
