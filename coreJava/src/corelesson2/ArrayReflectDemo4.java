package corelesson2;

import java.lang.reflect.Array;

public class ArrayReflectDemo4 {
	public static void main(String[] args) {
		test(new int[]{1,2,3});
		test("hello");
		System.out.println("===================");
		printObject(new int[]{1,2,3});
		System.out.println("=============");
		printObject(new String[][]{{"hello","world"},{"aaa","bbbb"}});
	}
	public static void test(Object obj){
		Class c = obj.getClass();
		//判断对象是不是数组
		System.out.println(c.isArray());
	}
	/**
	 * 如果object是非数组对象，直接打印toString
	 * 如果object是数组，打印数组中的每个元素
	 * @param object
	 */
	public static void printObject(Object object){
		//判断是否为数组
		Class c = object.getClass();
		if(c.isArray()){
			//获取数组长度
			int length = Array.getLength(object);
			//遍历数组的元素
			for(int i = 0; i < length;i++){
				//获取数组中的每个元素
				Object obj = Array.get(object, i);
				//数组的每个元素可能又是一个数组 递归
				printObject(obj);
				
			}
		}else{
			System.out.println(object);
		}
	}

}
