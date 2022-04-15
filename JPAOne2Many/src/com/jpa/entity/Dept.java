package com.jpa.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the DEPT database table.
 * 
 */
@Entity
@Table(name="DEPT")
public class Dept implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int deptno;

	@Column(name = "DNAME")
	private String dname;

	//bi-directional many-to-one association to Emp
	@OneToMany(mappedBy="dept", cascade=CascadeType.ALL)
	private Set<Emp> emps=new HashSet<Emp>();

	public Dept() {}
	public Dept(int deptno, String dname, Set<Emp> emps) {
		this.deptno = deptno;
		this.dname = dname;
		this.emps = emps;
	}
	public int getDeptno() {
		return this.deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return this.dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Set<Emp> getEmps() {
		return this.emps;
	}

	public void setEmps(Set<Emp> emps) {
	this.emps = emps;
	}
	public Emp addEmp(Emp emp) {
		getEmps().add(emp);
		emp.setDept(this);
		return emp;
	}

	public Emp removeEmp(Emp emp) {
		getEmps().remove(emp);
		emp.setDept(null);
		return emp;
	}
}