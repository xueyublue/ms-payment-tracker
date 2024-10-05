package sg.darren.ms.payment.tracker.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sg.darren.ms.payment.tracker.modal.entity.PaymentTrackerEntity;
import sg.darren.ms.payment.tracker.service.PaymentTrackerService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PaymentTrackerController {

    private final PaymentTrackerService paymentTrackerService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PaymentTrackerEntity> getList() {
        return paymentTrackerService.getList();
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public PaymentTrackerEntity get(@PathVariable("id") Integer id) {
        return paymentTrackerService.get(id);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public PaymentTrackerEntity create(@RequestBody PaymentTrackerEntity dto) throws Exception {
        return paymentTrackerService.create(dto);
    }

    @PutMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public PaymentTrackerEntity update(
            @PathVariable("id") Integer id,
            @RequestBody PaymentTrackerEntity dto) throws Exception {
        return paymentTrackerService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Integer id) {
        paymentTrackerService.delete(id);
        return "success";
    }
}
