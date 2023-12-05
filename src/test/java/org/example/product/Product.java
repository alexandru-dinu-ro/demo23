package org.example.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {

    private String provider;
    private String title;
    private String url;
    private String brand;
    private float price;
    private String unit;
    private boolean isPromo;
    private String promoDetails;
    private String image;

}
