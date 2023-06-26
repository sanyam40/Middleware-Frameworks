package com.boot.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class fileUploadController {
	
	@PostMapping("/upload-file")
	public ResponseEntity<String>uploadfile(@RequestParam("file")MultipartFile file) throws IOException{
		
		System.out.println(file.getSize());
		
		// file uploading
		String dir="C:\\Users\\SANYAM\\Documents\\workspace-spring-tool-suite-4-4.17.2.RELEASE\\SpringBoot-API-Student\\src\\main\\resources\\static\\image";
		InputStream is=file.getInputStream();
		byte data[]=new byte[is.available()];
		
		try (FileOutputStream fos = new FileOutputStream(dir+File.separator+file.getOriginalFilename())) {
			fos.write(data);
			fos.flush();
		}
		
		return ResponseEntity.ok("working");
	}
}
