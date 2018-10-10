package com.ict.erp;

import java.util.ArrayList;
import java.util.List;

class FileItem {
	private String name;
	private String string;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	@Override
	public String toString() {
		return "FileItem [name=" + name + ", string=" + string + "]";
	}
	public FileItem(String name, String string) {
		super();
		this.name = name;
		this.string = string;
	}
	public FileItem() {}
	
}

public class Filetest {
	
	public static List<FileItem> parse() {
		List<FileItem> fList = new ArrayList<FileItem>();
		FileItem fi = new FileItem("tmName", "캐스트어웨이");
		fList.add(fi);
		fi = new FileItem("tmPrice", "15000");
		fList.add(fi);
		fi = new FileItem("tmDesc", "재밋는영화");
		fList.add(fi);
		
		return fList;
	}

	public static void main(String[] args) {
		List<FileItem> fList = parse();
		for(FileItem fi : fList) {
			if(fi.getName().equals("tmName")) {
				System.out.println(fi.getString());
			}
		}
	}
}