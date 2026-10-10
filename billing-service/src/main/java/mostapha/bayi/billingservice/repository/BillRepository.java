package mostapha.bayi.billingservice.repository;

import mostapha.bayi.billingservice.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {
}
