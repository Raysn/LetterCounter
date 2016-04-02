/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Raysn
 */

//Singletonというデザインパターンを使いました。
//Singletonを使うとインスタンスが1つしか生成されないことを保証できます。
//参考にしたサイト: http://mitoroid.com/category/java/java_singleton.php
public class FileReminder {
	private static FileReminder instance = new FileReminder();
	private String fileName;

	private FileReminder() {
		fileName = null;
	}

	public static FileReminder getSingleton() {
		return instance;
	}

	public void setFileName( String fileName ) {
		this.fileName = fileName;
	}
	public String getFileName() {
		return fileName;
	}

	
}
