package corelesson4;

import java.io.File;

public class FileDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deleteFile(new File("d:\\lesson2"));
	}

	public static void deleteFile(File file) {
		File[] files = file.listFiles();
		for (File file2 : files) {
			if(file2.isFile()){//如果是文件直接删除
				System.out.println(file2.getAbsolutePath());
				file2.delete();
			}else if(file2.isDirectory()){
				//递归删除
				deleteFile(file2);
			}
		}
	    System.out.println(file.getAbsolutePath());
	    file.delete();
	}

}
