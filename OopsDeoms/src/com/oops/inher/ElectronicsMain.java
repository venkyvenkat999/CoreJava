package com.oops.inher;

public class ElectronicsMain {

	public static void main(String[] args) {
    Laptop laptop=new Laptop("14pl","oppo",100000,new String[]{"hdmi","usb","lan","vga"});
	Mobile mobile=new Mobile("18pl","sam",9000,"nicok");
	laptop.showPorts();
	mobile.showCameraType();
	}

}
