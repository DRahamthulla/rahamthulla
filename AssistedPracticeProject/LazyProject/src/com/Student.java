package com;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

@Entity
@Table(name="student_tbl")
	public class Student {
         @Id
         @GeneratedValue(strategy = GenerationType.AUTO)
		private int studentId;
         @Column(name="student_name")
		private String studentName;
	
		@ElementCollection(fetch = FetchType.EAGER)
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

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public String getStudentName() {
			return this.studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		
	}



