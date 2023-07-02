package com.bean;

import java.util.List;

public class Singer {
	
	private String SingerName;
	private String singerdate_of_birth;
	private int age;
	private List<String> songlist;
	
	//Getters and setters
	
    
	
	public List<String> getSonglist() {
		return songlist;
	}
	public String getSingerName() {
		return SingerName;
	}
	public void setSingerName(String singerName) {
		SingerName = singerName;
	}
	public String getSingerdate_of_birth() {
		return singerdate_of_birth;
	}
	public void setSingerdate_of_birth(String singerdate_of_birth) {
		this.singerdate_of_birth = singerdate_of_birth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSonglist(List<String> songlist) {
		this.songlist = songlist;
	}
	public void display()
	{
		System.out.println("******Singer Details******");
		System.out.println("Name::" + getSingerName());
		System.out.println("DOB::"+ getSingerdate_of_birth());
		System.out.println("AGE::" + getAge());
	}
	
	
	
}
