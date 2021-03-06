package io.insee.dev.k8sonboarding.configuration.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties(prefix="io.insee.dev.k8sonboarding")
public class ClusterProperties {
  
  private String namespacePrefix;
  private String userPrefix;
  private String nameNamespaceAdmin;
  private String apiserverUrl;
  
  public void setNamespacePrefix(String namespacePrefix) {
    this.namespacePrefix = namespacePrefix;
  }
 
  public String getNameNamespaceAdmin() {
    return nameNamespaceAdmin;
  }
  public void setNameNamespaceAdmin(String nameNamespaceAdmin) {
    this.nameNamespaceAdmin = nameNamespaceAdmin;
  }
  
  public String getNamespacePrefix() {
    return namespacePrefix;
  }

  public String getApiserverUrl() {
    return apiserverUrl;
  }
  public void setApiserverUrl(String apiserverUrl) {
    this.apiserverUrl = apiserverUrl;
  }

  public String getUserPrefix() {
    return userPrefix;
  }

  public void setUserPrefix(String userPrefix) {
    this.userPrefix = userPrefix;
  }
  
  
}
