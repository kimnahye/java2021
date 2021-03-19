package book.ch5;

import com.vo.EmpVO;

public class EmpList {
	/**********************************************************************************************
	 * 
	 * @param empno - 사원번호
	 * @return String []  - 사원이름 , 부서명
	 *********************************************************************************************/
	public String[] getEmpDetail(int empno) {
		String[] info = new String[2];
		EmpVO eVO = new EmpVO();
		eVO.setEmpno(7566);
		//eVO.setD
		return info;
	}
	public static void main(String[] args) {
		
		/*
		EmpVO eVO = new EmpVO();
		eVO = new EmpVO();
		eVO = new EmpVO();
		eVO = new EmpVO();
		*/
	}

}