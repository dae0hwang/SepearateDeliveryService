package com.example.apideliveryservice.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseOrderSuccess {

    private int status;
    private List<GeneralMemberOrderDto> orderList;
    private List<FoodPriceSumDto> sumStatisticList;
}
