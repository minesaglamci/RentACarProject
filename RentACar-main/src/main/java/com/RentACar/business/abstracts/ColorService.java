package com.RentACar.business.abstracts;

import java.util.List;

import com.RentACar.business.dtos.ColorListDto;
import com.RentACar.business.requests.CreateColorRequest;
import com.RentACar.core.concretes.BusinessException;

public interface ColorService {
	List<ColorListDto> getAll();
	void add(CreateColorRequest createColorRequest) throws BusinessException;
	ColorListDto getById(int colorId) throws BusinessException;




	
	
}
