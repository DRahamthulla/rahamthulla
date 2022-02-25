package com;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

    
	public class Student {
         @Id
		private long studentId;
         @Column(name="student_name")
		private String studentName;
	
		@ElementCollection
		@JoinTable(name="Address",joinColumns = @JoinColumn(name="studentId"))
		private Collection<Address> listofAddresses=new ArrayList<Address>();
        
		
		
		
		public Collection<Address> getListofAddresses() {
			return listofAddresses;
		}

		public void setListofAddresses(Collection<Address> listofAddresses) {
			this.listofAddresses = listofAddresses;
		}

		public Student() {
		}

		public Student(String studentName) {
			this.studentName = studentName;
		}

		public Student(String studentName, Address studentAddress) {
			this.studentName = studentName;
			
		}

		public long getStudentId() {
			return this.studentId;
		}

		public void setStudentId(long studentId) {
			this.studentId = studentId;
		}

		public String getStudentName() {
			return this.studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		
	}


