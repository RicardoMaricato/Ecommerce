package br.com.ricardo.ecommerce.checkout.service;

import br.com.ricardo.ecommerce.checkout.entity.CheckoutEntity;
import br.com.ricardo.ecommerce.checkout.resource.request.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}
