package com.zking.erp.orders.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Orders {
    private Integer oid;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ocreatetime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ochecktime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ostartime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date oendtime;

    private String otype;

    private Integer ocreater;

    private Integer ochecker;

    private Integer ostarter;

    private Integer oender;

    private Integer supplierid;

    private Float ototalmoney;

    private String ostate;


}