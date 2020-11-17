package oop;

public class TestTv {

	public static void main(String[] args) {
		TV tv1 = new TV();
		System.out.println("channel " + tv1.channel + " volumeLevel " + tv1.volumeLevel + " on : " + tv1.on);
		tv1.channelDown();
		tv1.volumeUp();
		System.out.println("channel " + tv1.channel + " volumeLevel " + tv1.volumeLevel + " on : " + tv1.on);
	}

}
