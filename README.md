# spring_test
my spring practice code

## BEAN POST PROCESSOR 
BeanPostProcessor is Class which implements BeanPostProcessor Class and overrides the following two methods.

1.public Object postProcessorBeforeInitialization(Object bean, String beanName){} - this method executes before initializing each bean

2.public Object postProcessorAfterInitialization(Object bean, String beanName){} - vice versa

**Note:** To implement the above add <bean class="package.TheClassThatImplementBeanPostProcessor"/> under beans.


##BEAN FACTORY POST PROCESSOR
This class is used to execute some tasks to be excuted before the bean factory initialization.
BeanFactoryPostProcessor is Class which implements BeanFactoryPostProcessor Class and overrides the following method.
public void postProcessBeanFactory(ConfigurableListableBeanFactory c){}


##PROPERTYPLACEHOLDERCONFIGURER
Used to supply the values of the bean from property file
i.e, if you want to set the values of the from a property file

## Set Annotatations 
For example the @Required Annotation in the commit tells the spring the field is required which is checked before the excution of the main
But if this is not set then the program throws NullPointerException
