package com.jse.phone;

public interface PhoneService {
	public void add (Phone phone);
	public void add (CellPhone phone);
	
	public void add(GalaxyNote phone);
	public void add(Iphone phone);
	public Phone [] list (Phone phone);
	public Iphone[] iphonelist();
	public GalaxyNote[] galaxyNotelist();
	public GalaxyNote detail(GalaxyNote phone);
	public Iphone detail(Iphone phone);
	public int count();
	
	
	
	public void update (Phone phone);
	public void delete(Phone phone);
 }
