package sg.darren.ms.payment.tracker.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sg.darren.ms.payment.tracker.exception.DataNotFoundException;
import sg.darren.ms.payment.tracker.modal.entity.PaymentTrackerEntity;
import sg.darren.ms.payment.tracker.repository.PaymentTrackerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PaymentTrackerService {

    private final PaymentTrackerRepository paymentTrackerRepository;

    public PaymentTrackerEntity get(Integer id) {
        return paymentTrackerRepository.findById(id)
                .orElse(null);
    }

    public List<PaymentTrackerEntity> getList() {
        return new ArrayList<>(paymentTrackerRepository.findAll());
    }

    public PaymentTrackerEntity create(PaymentTrackerEntity dto) throws Exception {
        return paymentTrackerRepository.save(dto);
    }

    public PaymentTrackerEntity update(Integer id, PaymentTrackerEntity dto) throws Exception {
        Optional<PaymentTrackerEntity> oldEntity = paymentTrackerRepository.findById(id);
        if (oldEntity.isEmpty()) {
            throw DataNotFoundException.credentialsNotFound(id);
        }
        // TODO:
        return paymentTrackerRepository.save(dto);
    }

    public void delete(Integer id) {
        if (paymentTrackerRepository.findById(id).isEmpty()) {
            throw DataNotFoundException.credentialsNotFound(id);
        }
        paymentTrackerRepository.deleteById(id);
    }

}
