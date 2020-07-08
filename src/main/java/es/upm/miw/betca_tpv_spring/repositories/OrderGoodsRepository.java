package es.upm.miw.betca_tpv_spring.repositories;

import es.upm.miw.betca_tpv_spring.documents.OrderGoods;
import org.springframework.data.repository.CrudRepository;

public interface OrderGoodsRepository  extends CrudRepository<OrderGoods, Long> {
}
