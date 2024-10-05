package sg.darren.ms.payment.tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sg.darren.ms.payment.tracker.modal.entity.PaymentTrackerEntity;

public interface PaymentTrackerRepository extends JpaRepository<PaymentTrackerEntity, Integer> {
}
