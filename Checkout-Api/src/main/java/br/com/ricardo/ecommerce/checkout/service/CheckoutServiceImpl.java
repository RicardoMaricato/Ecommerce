package br.com.ricardo.ecommerce.checkout.service;

import br.com.ricardo.ecommerce.checkout.entity.CheckoutEntity;
import br.com.ricardo.ecommerce.checkout.repository.CheckoutRepository;
import br.com.ricardo.ecommerce.checkout.resource.request.CheckoutRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class CheckoutServiceImpl implements CheckoutService {

    private final CheckoutRepository checkoutRepository;

    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {

        return Optional.empty();
    }

    @Override
    public Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status) {
        return Optional.empty();
    }
}
