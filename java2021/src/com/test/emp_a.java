package com.test;

public class emp_a {
	private int empno = 0; // 7566
	private String ename = "";// 사원명
	private String job = "";//
	private int mgr = 0;// 그룹코드
	private String hiredate = "";// 입사 일자
	private String sal = "";// 급여
	private String comm = "";// 인센티브
	// 릴레이션은 부모로 부터 내려받은 속성이다.
	private int deptno = 0;// 부서번호(FK)-외래키 - 조인시에 사용되는 컬럼 - 릴레이션이다.
	// 생성자의 경우 생략할 수 있고 생략되었을 때 JVM이 대신 제공해줌.
	// 그러나 한개라도 생성자 정의되어 있다면 제공한됨.(디폴트 생성자 포함-파라미터를 가지지 않는 생성자)

	public int getEmpno() {
		System.out.println("나가는 값은: " + empno);
		return empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public String getComm() {
		return comm;
	}

	public void setComm(String comm) {
		this.comm = comm;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
		System.out.println("들어온 값은: " + empno);
	}
}
