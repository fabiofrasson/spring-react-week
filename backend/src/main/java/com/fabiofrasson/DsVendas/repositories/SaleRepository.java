package com.fabiofrasson.DsVendas.repositories;

import com.fabiofrasson.DsVendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
