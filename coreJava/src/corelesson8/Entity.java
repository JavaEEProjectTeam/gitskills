package corelesson8;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * 定义注解的时候一定说明注解是修饰谁的？
 * 可以查看ElementType的源码
 */
@Target(ElementType.TYPE)//这是Target注解的实例化
//@Target(value={ElementType.TYPE,ElementType.FIELD})
/*
 * 定义注解的时候一定要指明注解什么时候有效
 * 可以查看RetentionPolicy的源码
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Entity {
	String value() default "hello";
	int[] testArray() default {1,2,3,4,5,6};
	WeekDay2 testEnum() default WeekDay2.FRI;
	Id testAnno() default @Id("bye-bye");
}

