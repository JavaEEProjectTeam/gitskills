package corelesson5;

public class Single {
	private static Single instance = null;
	private Single(){}
	/**
	 * 多线程并发的情况，还能保证单例子模式
	 * @return
	 */
	public synchronized static Single getInstance(){
		if(instance==null){
			instance = new Single();
		}
		return instance;
	}
	
}
