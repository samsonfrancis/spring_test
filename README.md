# spring_test
my spring practice code

## BEAN POST PROCESSOR 
BeanPostProcessor is Class which implements BeanPostProcessor Class and overrides the following two methods.

1.public Object postProcessorBeforeInitialization(Object bean, String beanName){} - this method executes before initializing each bean

2.public Object postProcessorAfterInitialization(Object bean, String beanName){} - vice versa

**Note:** To implement the above add <bean class="package.TheClassThatImplementBeanPostProcessor"/> under beans.




