package corelesson5;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class CacheDemo {
	/*
	 * 修改数据的时候只能一个线程
	 * 但是如果只是读数据  所有线程都可以访问
	 * 读写锁的机制
	 */
	private HashMap<String,String> hm = new HashMap<String,String>();
	private ReentrantReadWriteLock rrw = new ReentrantReadWriteLock();
    private String value = null;
    public String getData(String key){
    	/*value = hm.get(key);
    	  if(value==null){
    		  value = "hello";//将来是通过其他资源获取
    		  hm.put(key, value);
    	  }
    	  return value;*/
    	rrw.readLock().lock();
    	try{
    		value = hm.get(key);//大家都能来读
    		if(value==null){
    			//要进行写操作
    			rrw.readLock().unlock();
    			rrw.writeLock().lock();
    			try{
    				if(value==null){
    				value = "hello";
    				hm.put(key, value);
    				}
    			}finally{
    				rrw.writeLock().unlock();
    				rrw.readLock().lock();
    			}
    		}
    	}finally{
    		rrw.readLock().unlock();
    	}
    	return value;
    }
}
