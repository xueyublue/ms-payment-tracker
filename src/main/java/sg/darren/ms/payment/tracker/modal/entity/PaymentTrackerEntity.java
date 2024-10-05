package sg.darren.ms.payment.tracker.modal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "tbl_payment_tracker")
@DynamicUpdate
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentTrackerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "txn_amount")
    private BigDecimal txnAmount;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "txn_date", updatable = false)
    private Date txnDate;

    @Column(name = "category")
    private String category;

    @Column(name = "store")
    private String store;

    @Column(name = "remarks1")
    private String remarks1;

    @Column(name = "remarks2")
    private String remarks2;

    @Column(name = "remarks3")
    private String remarks3;

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "created_date", updatable = false)
    private Date createdDate;

    @Column(name = "created_by")
    private String createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    @Column(name = "updated_date")
    private Date updatedDate;

    @Column(name = "updated_by")
    private String updatedBy;

}
