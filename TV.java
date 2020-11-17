package oop;

public class TV {
	public int channel;
	public int volumeLevel ; 
	public boolean on ;
	TV(){
		channel = 4;
		volumeLevel = 2;
		on = true;
	}
	public void turnOn() {
		on =true;
	}
	public void turnOff() {
		on = false;	
		}
	public void setChannel(int newChannel) {
		if(newChannel < 1 || newChannel >120 || on ==false) {
			return;
		}
		channel = newChannel;
	}
	public void setVolume(int newVolumeLevel) {
		if(newVolumeLevel<1 || newVolumeLevel>7 || on ==false) {
			return;
		}
		volumeLevel = newVolumeLevel; 
	}
	public void channelUp() {
		if(channel ==120 || !on) {
			return;
		}
		channel++;
	}
	public void channelDown () {
		if(channel ==1 || !on) {
			return;
		}
		channel--;
	}
	public void volumeUp () {
		if(volumeLevel ==7 || !on) {
			return;
		}
		volumeLevel ++;
	}
	public void volumeDown() {
		if(volumeLevel ==1 || !on) {
			return;
		}
		volumeLevel --;
	}
}
