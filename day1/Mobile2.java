package week1.day1;

public class Mobile2 {

        public void makecall() {
        	System.out.println("Make Call");
        }
        public void sendMsg() {
        	System.out.println("This is my mobile");
        }
    	public static void main(String[] args) {
      	String VarModel="REALME VERSION2";
        	float VarWeight=16.3f;
        	boolean isCharged=true;
        	int MobileCost=16000;

        Mobile2 obj = new Mobile2();
        obj.sendMsg();
        obj.makecall();
   }
}