package com.devsuperior.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repo;

	public List<SellerDTO> findAll() {
		List<Seller> list = repo.findAll();
		return list.stream().map(obj -> new SellerDTO(obj)).collect(Collectors.toList());
	}

}
