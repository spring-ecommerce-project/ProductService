package com.arjunnigam.productservice.exceptions;

public class ProductNotFoundException extends Exception{

    private Long productId;

    public ProductNotFoundException(Long productId) {
        this.productId = productId;
    }

    public ProductNotFoundException() {

    }

    public Long getProductId(){
        return productId;
    }
    public void setProducctId(Long productId){
        this.productId = productId;
    }
}
