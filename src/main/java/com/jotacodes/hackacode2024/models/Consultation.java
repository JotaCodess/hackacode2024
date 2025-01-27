package com.jotacodes.hackacode2024.models;

import java.util.Date;

public class Consultation {

    private Long id;
    private Date consultDate;
    private Date hourDate;
    private Patient patient;
    private Medic medic;
    //Service or package contracted
    private Integer totalAmount;
    private Boolean hasPaid;
}
