package sp4.sp4_test01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
        System.out.println( "Hello World!" );
        
        Greeter gr = ctx.getBean("gr", Greeter.class);
        String msg = gr.greet("최연석");
        System.out.println(msg);
        
        Greeter gr2 = ctx.getBean("gr", Greeter.class);
        String msg2 = gr2.greet("최연석");
        System.out.println(msg);
    }
}
