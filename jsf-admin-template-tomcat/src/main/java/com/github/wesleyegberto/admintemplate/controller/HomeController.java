package com.github.wesleyegberto.admintemplate.controller;

import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

@Model
public class HomeController {
    
    private void addMessage(Severity severity, String message) {
	FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, message, null));
    }

    public void doToughWork() {
	// Just to show the loader
	try {
	    Thread.sleep(5000);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }
    
    public void doRiskyWork() {
	addMessage(FacesMessage.SEVERITY_ERROR, "An error has occurred");
    }

    public void causeUnknownException() {
	throw new RuntimeException("Opsss");
    }
    
    public void save() {
	addMessage(FacesMessage.SEVERITY_INFO, "Saved successfully");
    }
    
    public void edit() {
	addMessage(FacesMessage.SEVERITY_WARN, "Can't edit right now");
    }
}
