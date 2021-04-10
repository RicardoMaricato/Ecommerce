package br.com.ricardo.ecommerce.payment.service;

import br.com.ricardo.ecommerce.payment.entity.PaymentEntity;
import br.com.ricardo.ecommerce.payment.event.CheckoutCreatedEvent;

import java.util.Optional;

public interface PaymentService {

    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);
}
