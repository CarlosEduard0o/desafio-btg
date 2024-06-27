package tech.buildrun.btgpactual.orderms.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import tech.buildrun.btgpactual.orderms.controller.dto.OrderResponse;
import tech.buildrun.btgpactual.orderms.entity.OrderEntity;

public interface OrderRepository extends MongoRepository <OrderEntity, Long> {
    /**
     * O parâmetro customerID precisa ter o nome
     * exatamente igual o customerId em OrderEntity
     * @param customerId
     * @param pageRequest
     * @return
     */
    Page<OrderEntity> findAllByCustomerId(Long customerId, PageRequest pageRequest);
}
