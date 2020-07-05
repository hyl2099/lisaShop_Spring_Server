package es.upm.miw.betca_tpv_spring.repositories;

import es.upm.miw.betca_tpv_spring.TestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestConfig
class ArticlesFamilyRepositoryIT {

    @Autowired
    private FamilyCompositeRepository familyCompositeRepository;

    @Test
    void testReadAll() {
        assertTrue(this.familyCompositeRepository.findByReference("root").isPresent());
    }

}
