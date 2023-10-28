
//
//class HelloJtc{
//	int val;
//}
//
//class Employee{
//	public void finalize() {
//		Thread th=Thread.currentThread();
//		for(int i=100;i<900;i++) {
//			System.out.println(th.getName()+"    "+th.isDaemon()+  "\t"+  i);
//			try {
//				Thread.sleep(100);
//			}catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}
//
//
//class thread1 extends Thread{
//	HelloJtc h=null;
//	
//	thread1(HelloJtc h){
//		this.h=h;
//	}
//	
//	public void run() {
//		for(int i=0;i<12;i++) {
//			h.val=i;
//			System.out.println("Storing the Data\t"+i+"\t"+isDaemon());
//			try {
//				Thread.sleep(i);;
//			}catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}
//
//
//class d{
//	public static void main(String[] args) {
//		HelloJtc h=new HelloJtc();
//		
//		thread1 t1=new thread1(h);
//		
//		t1.setDaemon(true);
//		t1.start();
//		
//		new Employee();
//		System.gc();
//		
//		Thread th=Thread.currentThread();
//		for(int i=0;i<15;i++) {
//			System.out.println("in main\t:"+h.val+"\t"+th.isDaemon());
//			try {
//				Thread.sleep(100);
//			}catch (Exception e) {
//				e.printStackTrace(); 
//			}
//		}
//	}
//}
