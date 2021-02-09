package com.src;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXBExample {

	public static void main(String[] args) {
		
		//Marshalling-->converting java objects into xml
		
		DemoEmployee emp = new DemoEmployee();
		emp.setEmpNo(342);
		emp.setName("Hasib");
		emp.setSalary(25000);
		
		//creating JAXBContext object
		try {
			JAXBContext context = JAXBContext.newInstance(DemoEmployee.class);
		//creating Marshaller object from JAXBContext...
			
		 Marshaller marshaller=	context.createMarshaller();
		 //call Marshaller...to display generated xml on console
		 
		 marshaller.marshal(emp, System.out);
		 
		 
		 //.storing generated XML in file
		 File file = new File("emp.xml");
		 marshaller.marshal(emp,file);
		 System.out.println("written in emp.xml file");
		 
		 
		 //now Unmarshelling....
		 
		 JAXBContext jc = JAXBContext.newInstance(DemoEmployee.class);
		 Unmarshaller ums = jc.createUnmarshaller();
		 
		 DemoEmployee emp2 = (DemoEmployee) ums.unmarshal(new File("emp.xml"));
		 System.out.println("Employee information");
		 System.out.println("Name : "+emp2.getEmpNo());
		 System.out.println("Name : "+emp2.getName());
		 System.out.println("Name : "+emp2.getSalary());
		} 
		catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}