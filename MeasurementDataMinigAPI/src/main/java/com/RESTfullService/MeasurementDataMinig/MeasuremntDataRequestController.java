package com.RESTfullService.MeasurementDataMinig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/measurement")
public class MeasuremntDataRequestController {
    
    @Autowired
    private MeasurementObjects measurementObjacts;
    
    @PostMapping()
      
    
    
}
