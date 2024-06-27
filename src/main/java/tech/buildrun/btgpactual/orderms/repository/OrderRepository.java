package tech.buildrun.btgpactual.orderms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tech.buildrun.btgpactual.orderms.entity.OrderEntity;

public interface OrderRepository extends MongoRepository <OrderEntity, Long> {
}
