package com.fabiofrasson.DsVendas.services;

import com.fabiofrasson.DsVendas.dto.SellerDTO;
import com.fabiofrasson.DsVendas.entities.Seller;
import com.fabiofrasson.DsVendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll() {
        List<Seller> result =  repository.findAll();
        return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }
}
