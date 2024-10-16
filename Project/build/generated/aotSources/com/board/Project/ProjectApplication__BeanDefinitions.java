package com.board.Project;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link ProjectApplication}.
 */
@Generated
public class ProjectApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'projectApplication'.
   */
  public static BeanDefinition getProjectApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ProjectApplication.class);
    beanDefinition.setTargetType(ProjectApplication.class);
    ConfigurationClassUtils.initializeConfigurationClass(ProjectApplication.class);
    beanDefinition.setInstanceSupplier(ProjectApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
