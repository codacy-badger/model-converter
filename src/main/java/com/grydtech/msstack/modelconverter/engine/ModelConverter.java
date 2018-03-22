package com.grydtech.msstack.modelconverter.engine;

import com.grydtech.msstack.modelconverter.business.BusinessModel;
import com.grydtech.msstack.modelconverter.microservice.MicroServiceModel;

import java.util.List;

public interface ModelConverter {
    List<MicroServiceModel> convertToMicroServiceModel(BusinessModel businessModel);
}
