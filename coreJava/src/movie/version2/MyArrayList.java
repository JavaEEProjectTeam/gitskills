package movie.version2;

import java.util.Arrays;

public class MyArrayList {
	private Object[] objects = new Object[10];
	private int index = 0;//记录有效元素
	//往数组中添加元素，每次都添加在最后一个有效位置
	public void add(Object object){
		if(index==objects.length)
			expand();
		objects[index++] = object;
	}
	private void expand(){
		objects = Arrays.copyOf(objects, objects.length*2);
	}
	public Object[] getObjects() {
		return objects;
	}
	/**
	 * 根据下标获取某个元素
	 * @param index 下标
	 * @return 元素
	 */
	public Object get(int index){
		System.out.println(this.index);
		if(index< 0 || index >= this.index)//不能超出有效元素的范围
			throw new ArrayIndexOutOfBoundsException();
		return objects[index];
	}
	/**
	 * 获取某个对象的下标
	 * @param object
	 * @return
	 */
	public int getDataIndex(Object object){
		for(int i = 0; i < index;i++){
			if(object.equals(objects[i]))
				return i;
		}
		return -1;
	}
	public boolean contains(Object object){
		for(int i = 0; i < index;i++){
			if(object.equals(objects[i]))
				return true;
		}
		return false;
	}
	public int getIndex() {
		return index;
	}
	public Iterator iterator(){
		return new MyIterator();
	}
	private class MyIterator implements Iterator{
		private int size = 0;
		@Override
		public Object getCurrent() {
			// TODO Auto-generated method stub
			return objects[size];
		}

		@Override
		public boolean isDone() {
			// TODO Auto-generated method stub
			return size == index;
		}

		@Override
		public void next() {
			size++;
		}
		
	}

}
