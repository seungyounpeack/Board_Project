package com.board.Project;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MyController}.
 */
@Generated
public class MyController__BeanDefinitions {
  /**
   * Get the bean definition for 'myController'.
   */
  public static BeanDefinition getMyControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MyController.class);
    beanDefinition.setInstanceSupplier(MyController::new);
    return beanDefinition;
  }
}
