package com.gupaoedu.vip.mvc.framework.my.Servlet;

import java.util.Map;

public class MyModelAndView {

	//页面模板
	private String view;

	/** Model Map */
	//要往页面上带过去的值
	private Map<String,Object> model;

	public MyModelAndView(String view){
		this.view = view;
	}

	public MyModelAndView(String view, Map<String,Object> model){
		this.view = view;
		this.model = model;
	}

	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}

	public Map<String, Object> getModel() {
		return model;
	}

	public void setModel(Map<String, Object> model) {
		this.model = model;
	}
	
	
}
