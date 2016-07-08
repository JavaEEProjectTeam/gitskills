package corelesson8;

public class VaParameterDemo {
	public static void main(String[] args) {
		/*System.out.println(add(new int[]{}));
		System.out.println(add(new int[]{1}));
		System.out.println(add(new int[]{1,2,3,4}));*/
		System.out.println(add());
		System.out.println(add(1));
		System.out.println(add(1,2));//添加了add(int,int)方法后直接和该方法匹配
		System.out.println(add(1,2,3,4));
		System.out.println(add(new int[]{1,2,3,4,5}));
	}
	//写一个加法希望能完成任意整数的相加
	/*public static int add(int[] a){
		int sum = 0;
		for(int i = 0; i<a.length;i++){
			sum += a[i];
		}
		return sum;
	}*/
	//... 当做数组处理jvm是直接认为就是一个数组
	public static int add(int ... a){
		int sum = 0;
		for(int i = 0 ; i < a.length;i++){
			sum += a[i];
		}
		return sum;
	}
	//一个函数只能有一个可变参数并且可变参数必须放在最后一个参数
   public static void print(int a,double ...d){
	   
   }
   //重载的时候找最精确的匹配
  public static int add(int a,int b){
	  return a+b;
  }

}
