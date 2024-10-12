package com.tamer.BankBackend.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.security.authorization.event.AuthorizationDeniedEvent;

@Slf4j
public class AuthorizationEvents {

    @EventListener
    public void onFailure(AuthorizationDeniedEvent deniedEvent) {
        log.error("Authorization failed for the user : {} due to : {}", deniedEvent.getAuthentication().get().getName(),
                deniedEvent.getAuthorizationDecision().toString());
    }

}