package com.encore.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.encore.spring.model.UploadDataVO;

@Controller
public class FileController {
 
	@RequestMapping("fileupload.do")
	public ModelAndView fileupload(HttpServletRequest request, UploadDataVO vo ) throws Exception{
		//1. 업로드된 파일의 정보를 가지고 있는  MultipartFile을 하나 받아온다..vo에서
		MultipartFile mFile = vo.getUploadFile();
		System.out.println("mfile ::"+ mFile);
		return new ModelAndView();
	}
}
