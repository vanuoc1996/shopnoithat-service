package com.web.shop.entity.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SearchProduct {
    private String  productCode = "";
    private String  productName = "";
    private long    priceNewMin = 0;
    private long    priceNewMax = Long.MAX_VALUE;
}
