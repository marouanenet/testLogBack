package com.msaidi.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccueilServlet extends HttpServlet {
	private static final long serialVersionUID = -2573663386448328793L;
	private static final Logger logger = LoggerFactory
			.getLogger(AccueilServlet.class);

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		logger.info("AccueilServlet doGet...");
	}
}
