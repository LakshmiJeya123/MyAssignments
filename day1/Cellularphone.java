package week1.day1;

public class Cellularphone {
	public void sendSMS() {
       System.out.println("HelloTestleaf");
	}

	protected void allowVoiceCall() {
       System.out.println("voicecall");
	}

	private void takevideo() {
       System.out.println("video");
	}

	public static void main(String[] args) {
         Cellularphone obj = new Cellularphone();
         obj.sendSMS();
         obj.allowVoiceCall();
         obj.takevideo();
         
     
		
	}

}
