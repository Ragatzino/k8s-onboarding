package io.insee.dev.k8sonboarding.controller;

import org.keycloak.adapters.springboot.KeycloakSpringBootProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.insee.dev.k8sonboarding.property.ClusterProperties;
import io.insee.dev.k8sonboarding.property.UiProperties;
import io.insee.dev.k8sonboarding.view.AppConfiguration;

@RestController
@RequestMapping("/api/public/configuration")
public class ConfigurationController {

    @Autowired
    KeycloakSpringBootProperties keycloakSpringBootProperties;

    @Autowired
    ClusterProperties clusterProperties;

    @Autowired
    UiProperties uiProperties;

    @GetMapping
    public AppConfiguration getConfiguration() {
	final AppConfiguration appConfiguration = new AppConfiguration();
	appConfiguration.setAuthUrl(keycloakSpringBootProperties.getAuthServerUrl());
	appConfiguration.setRealm(keycloakSpringBootProperties.getRealm());
	appConfiguration.setResource(keycloakSpringBootProperties.getResource());
	appConfiguration.setClientId(uiProperties.getClientId());
	return appConfiguration;
    }

}