package com.jotacodes.hackacode2024.models.medicalservices;

import java.util.List;

public class MedicPackage {

    private Integer id_package;
    private List<MedicalService> services;
    private Double package_price;

    public MedicPackage(Integer id_package, List<MedicalService> services) {
        this.id_package = id_package;
        this.services = services;
            
        packagePrice();
    }  

    public Double packagePrice(){
        Double total = 0.0;

        for (MedicalService medicalService : services) {
            total += medicalService.getPrice();
        }
        total = total * 0.15;

        /*if (!obraSocial) {
            return total;
        }*/

        return total * 0.20;
    }


}
