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
public class OrderDetail {
    private Integer orderdetailid;

    private Integer gid;

    private String gname;

    private Float oprice;

    private Integer onum;

    private Float omoney;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date oendtime;

    private Integer oender;

    private Integer storeid;

    private String ostate;

    private Integer oid;


}