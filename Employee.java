package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees4")
public class Employee {

	

	    private long Employeeid;
	    private String EmployeeName;
	    private int StartTime;
	    private int  EndTime;
	    private String UpdateDate;
	    private int  Hours;
	    private int salary;
	    

	    public Employee() {

	    }

	    public Employee(String EmployeeName , int StartTime , int EndTime   ,String UpdateDate,int Hours, int salary ) {
	        this.EmployeeName = EmployeeName;
	        this.StartTime = StartTime;
	        this.EndTime = EndTime;
	        this. UpdateDate = UpdateDate;
	        this. Hours = Hours;
	        this.salary=salary;
	    }
	   @Id
		public long getEmployeeid() {
			return Employeeid;
		}

		public void setEmployeeid(long employeeid) {
			Employeeid = employeeid;
		}
         @Column(name="employeeName",nullable =false)
		public String getEmployeeName() {
			return EmployeeName;
		}

		public void setEmployeeName(String employeeName) {
			EmployeeName = employeeName;
		}
		@Column(name="StartTime",nullable =false)
		public int getStartTime() {
			return StartTime;
		}

		public void setStartTime(int startTime) {
			StartTime = startTime;
		}
		@Column(name="EndTime",nullable =false)
		public int getEndTime() {
			return EndTime;
		}

		public void setEndTime(int endTime) {
			EndTime = endTime;
		}
		@Column(name="UpdateDate",nullable =false)
		public String getUpdateDate() {
			return UpdateDate;
		}

		public void setUpdateDate(String updateDate) {
			UpdateDate = updateDate;
		}
		@Column(name="Hours",nullable =false)
		public int getHours() {
			return Hours;
		}

		public void setHours(int hours) {
			Hours = hours;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}
		@Column(name="salary",nullable =false)
		public int getSalary() {
			return salary;
		}

		
		
		 
}

