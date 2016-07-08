package io;

import java.io.File;
import java.io.IOException;


public class FileDemo1 {
	public static void main(String[] args) {
		File file = new File("D:\\javalessons\\coreJava\\javaSE-core");
		System.out.println(file.exists());//true代表目录存在false代表不存在
		//File file1 = new File("D:\\javalessons\\coreJava\\javaSE-core\\aa");
		//File file1 = new File(file,"aa");
		File file1 = new File("D:\\javalessons\\coreJava\\javaSE-core","aa");
		if(!file1.exists())
			file1.mkdir();//创建目录  mkdirs
		else
			file1.delete();//删除目录
		System.out.println(file1.isDirectory());//判断是否是一个目录，如果目录不存在也返回false
		System.out.println(file1.isFile());//判断是否是一个文件
		System.out.println("=====================");
		File file2 = new File("D:\\javalessons\\coreJava\\javaSE-core\\Excel.java");
		System.out.println(file2.isFile());
		System.out.println(file2.exists());
		File file3 = new File(file,"1.txt");
		if(!file3.exists())
			try {
				file3.createNewFile();//创建文件
			} catch (IOException e) {
				e.printStackTrace();
			}
		else
			file3.delete();
		
		
		System.out.println(file.getAbsolutePath());
		System.out.println(file2.getAbsolutePath());
		
		System.out.println("=============");
		System.out.println(file.getName());
		System.out.println(file2.getName());
		System.out.println("===============");
		System.out.println(file.getParent());//得到父目录字符串
		System.out.println(file2.getParent());
		System.out.println("==================");
		//getParentFile()得到父目录的File对象
		System.out.println(file.getParentFile().getAbsolutePath());
		System.out.println(file2.getParentFile().getAbsolutePath());
	}

}
