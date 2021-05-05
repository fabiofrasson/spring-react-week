package com.fabiofrasson.DsVendas.repositories;

import com.fabiofrasson.DsVendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
