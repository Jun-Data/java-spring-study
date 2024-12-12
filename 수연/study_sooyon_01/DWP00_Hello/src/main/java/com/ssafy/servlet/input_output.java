package com.ssafy.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// annotation 방식
//@WebServlet("/input_output")
public class input_output extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int initCount = 0;
	int doGetCount = 0;
	int destroyCount = 0;
	
	public input_output() {
		System.out.println("생성자 호출!");
	}
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 메서드 호출" + (initCount++));
	}
	
	public void destroy() {
		System.out.println("destroy 메서드 호출  " + (destroyCount++));
		System.out.println("Finish");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("doGet 메서드 호출" + (doGetCount++));
	}


}
