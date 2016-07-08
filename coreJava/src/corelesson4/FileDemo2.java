package corelesson4;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileDemo2 {
	public static void main(String[] args) {
		File file = new File("D:\\javalessons\\coreJava\\javaSE-oop\\lesson2");
		//listFile(file);
		//listFile1(file);
		//listFile2(file);
		//listFile3(file);
		//listFile4(file);
		listFile5(file);
	}
	public static void listFile(File file){
		/*
		 * 列出该目录下所有的目录名和文件名 不会列出整个目录名称，
		 * 也不会遍历子目录
		 */
		String[] filenames = file.list();
		for (String string : filenames) {
			System.out.println(file.getAbsolutePath()+"\\"+string);
		}
		System.out.println("==============");
		//直接列出目录下的，产生的是File对象
		File[] files = file.listFiles();
	    for (File file2 : files) {
			System.out.println(file2.getAbsolutePath());
		}
	}
	/**
	 * 能够遍历file和file子目录下的所有内容
	 * @param file
	 */
	public static void listFile1(File file){
		File[] files  = file.listFiles();
		for (File file2 : files) {
			if(file2.isFile()){//如果是文件
				System.out.println(file2.getAbsolutePath());
			}else if(file2.isDirectory()){//如果是目录 进行递归调用
				listFile1(file2);
			}
		}
	}
	public static void listFile2(File file){
		//String[] filenames = file.list(new MyFileNameFilter());
		String[] filenames = file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".java");
			}
		});
		for (String string : filenames) {
			System.out.println(file.getAbsolutePath()+"/"+string);
		}
	}
	static class MyFileNameFilter implements FilenameFilter{
		//file列出的每个文件都要调用accept方法，返回true留下，false被过滤
		@Override
		public boolean accept(File dir, String name) {
			//File dir 代表父目录     name代表直接子的名字是文件名or目录名
			//System.out.println(dir.getAbsolutePath()+" ... "+name);
			return name.endsWith(".java");
		}
		
	}
	public static void listFile3(File file){
		File[] files = file.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				// pathname 就是file下的每个文件or目录
			//	System.out.println(pathname);
				return pathname.getAbsolutePath().endsWith(".java");
			}
		});
		System.out.println("=======================");
		for (File file2 : files) {
			System.out.println(file2.getAbsolutePath());
		}
	}
	//递归拿出.java文件，包括子目录下的
	public static void listFile4(File file){
		File[] files = file.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
			    if(pathname.isFile())
				return pathname.getAbsolutePath().endsWith(".java");
			    else if(pathname.isDirectory())
			    	listFile4(pathname);
			    return true;
			    
			}
		});
		for (File file2 : files) {
			if(file2.isFile())
			System.out.println(file2.getAbsolutePath());
		}
		
	}
	public static void listFile5(File file){
		File[] files = file.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				//System.out.println(dir.getAbsolutePath()+" ...  "+name);
				File file1 = new File(dir,name);
				if(file1.isFile())
					return name.endsWith(".java");
				else if(file1.isDirectory())
					listFile5(file1);
				return true;
			}
		});
		for (File file2 : files) {
			if(file2.isFile())
			System.out.println(file2.getAbsolutePath());
		}
	}
}
