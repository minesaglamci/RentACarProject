package com.RentACar.business.abstracts;

import java.util.List;

import com.RentACar.business.dtos.BrandListDto;
import com.RentACar.business.requests.CreateBrandRequest;
import com.RentACar.core.concretes.BusinessException;

public interface BrandService {

	List<BrandListDto> getAll();
	void add(CreateBrandRequest createBrandRequest) throws BusinessException;
	BrandListDto getById(int brandId) throws BusinessException;

	
}
