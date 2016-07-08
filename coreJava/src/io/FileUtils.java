package io;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
	/**
	 * 列出指定目录下（包括其子目录）的所有文件
	 * 
	 * @param dir
	 * @throws IOException
	 */
	public static void listDirectory(File dir) throws IOException {
		if (!dir.exists()) {
			throw new IllegalArgumentException("目录：" + dir + "不存在");
		}

		if (!dir.isDirectory()) {
			throw new IllegalArgumentException(dir + "不是目录");
		}
		File[] subs = dir.listFiles();
		if (subs != null && subs.length > 0) {
			for (File sub : subs) {
				if (sub.isDirectory()) {
					listDirectory(sub);
				} else {
					System.out.println(sub);
				}
			}
		}

	}

	private static List<File> listFile(File dir, FileFilter ff,
			boolean recursive) {
		List<File> list = new ArrayList<File>();
		File[] subs = dir.listFiles(ff);
		if (subs != null && subs.length > 0) {
			for (File sub : subs) {
				if (sub.isFile()) {
					list.add(sub);
				} else if (recursive) {
					list.addAll(listFile(sub, ff, true));
				}
			}
		}
		return list;
	}

	/**
	 * 
	 * 
	 * @param dir
	 * @param extensions
	 * @param recursive
	 * @return
	 */
	public static List<File> listFile(File dir, final String[] extensions,
			boolean recursive) {
		if (!dir.exists()) {
			throw new IllegalArgumentException("目录：" + dir + "不存在");
		}

		if (!dir.isDirectory()) {
			throw new IllegalArgumentException(dir + "不是目录");
		}

		//
		FileFilter ff = null;
		if (extensions == null || extensions.length == 0) {
			ff = new FileFilter() {
				@Override
				public boolean accept(File pathname) {
					return true;
				}
			};
		} else {
			ff = new FileFilter() {
				@Override
				public boolean accept(File pathname) {
					if (pathname.isDirectory())
						return true;
					String name = pathname.getName();
					for (String ext : extensions) {
						if (name.endsWith(ext)) {
							return true;
						}
					}
					return false;
				}
			};
		}

		return listFile(dir, ff, recursive);

	}

	/**
	 * 扩展部分
	 * 
	 * @param dir
	 * @param filename
	 * @param recursive
	 * @return
	 */
	public static List<File> listFile(File dir, final String filename,
			boolean recursive) {
		if (!dir.exists()) {
			throw new IllegalArgumentException("目录：" + dir + "不存在");
		}

		if (!dir.isDirectory()) {
			throw new IllegalArgumentException(dir + "不是目录");
		}

		//
		FileFilter ff = null;
		if (filename == null || filename.length() == 0) {
			ff = new FileFilter() {
				@Override
				public boolean accept(File pathname) {
					return true;
				}
			};
		} else {
			ff = new FileFilter() {
				@Override
				public boolean accept(File pathname) {
					if (pathname.isDirectory())
						return true;
					String name = pathname.getName();
					if (name.indexOf(filename) != -1)
						return true;
					else
						return false;
				}
			};
		}

		return listFile(dir, ff, recursive);

	}

	
	/**
	 * 删除指定目录及其包含的所有内容
	 * 
	 * @param dir
	 * @throws IOException
	 */
	public static void deleteDirectory(File dir) throws IOException {
		if (!dir.exists()) {
			throw new IllegalArgumentException("目录：" + dir + "不存在");
		}

		if (!dir.isDirectory()) {
			throw new IllegalArgumentException(dir + "不是目录");
		}

		File[] subs = dir.listFiles();
		if (subs != null && subs.length > 0) {
			for (File sub : subs) {
				if (sub.isDirectory()) {
					deleteDirectory(sub);
				} else {
					System.out.println(sub);
					if (!sub.delete()) {
						throw new IOException("无法删除文件：" + sub);
					}
				}
			}
		}
		System.out.println(dir);
		if (!dir.delete()) {
			throw new IOException("无法删除目录：" + dir);
		}
	}

	/**
	 * 
	 * @param src
	 * @param dest
	 */
	public static void copyFile(File srcFile, File destFile) throws IOException {
		if (!srcFile.exists()) {
			throw new IllegalArgumentException("文件：" + srcFile + "不存在");
		}
		if (!srcFile.isFile()) {
			throw new IllegalArgumentException(srcFile + "不是文件");
		}
		RandomAccessFile srcRaf = new RandomAccessFile(srcFile, "r");
		if (!destFile.exists()) {
			if (!destFile.createNewFile())
				throw new IOException("无法创建文件：" + destFile);
		}
		RandomAccessFile destRaf = new RandomAccessFile(destFile, "rw");
		byte[] buffer = new byte[8 * 1024];
	
		int len = -1;
		while ((len = srcRaf.read(buffer)) != -1) {
			destRaf.write(buffer, 0, len);
		}
		srcRaf.close();
		destRaf.close();
	}

	/**
	 * 
	 * @param srcDir
	 * @param destDir
	 * @throws IOException
	 */
	public static void copyDirectory(File srcDir, File destDir)
			throws IOException {
		if (!srcDir.exists()) {
			throw new IllegalArgumentException("文件：" + srcDir + "不存在");
		}
		if (!srcDir.isDirectory()) {
			throw new IllegalArgumentException(srcDir + "不是目录");
		}
		if (!destDir.exists()) {
			if (!destDir.mkdir())
				throw new IOException("无法创建目录：" + destDir);
		}
		File[] subs = srcDir.listFiles();
		if (subs != null && subs.length > 0) {
			for (File sub : subs) {
				if (sub.isFile()) {
					copyFile(sub, new File(destDir, sub.getName()));
				} else if (sub.isDirectory()) {
					copyDirectory(sub, new File(destDir, sub.getName()));
				}
			}
		}
	}

}
