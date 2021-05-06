package com.fabiofrasson.DsVendas.services;

import com.fabiofrasson.DsVendas.dto.SaleDTO;
import com.fabiofrasson.DsVendas.dto.SaleSuccessDTO;
import com.fabiofrasson.DsVendas.dto.SaleSumDTO;
import com.fabiofrasson.DsVendas.entities.Sale;
import com.fabiofrasson.DsVendas.repositories.SaleRepository;
import com.fabiofrasson.DsVendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> result =  repository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller() {
        return repository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> successGroupedBySeller() {
        return repository.successGroupedBySeller();
    }
}
