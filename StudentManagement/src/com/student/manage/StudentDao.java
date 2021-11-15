package com.student.manage;

import java.sql.PreparedStatement;
import java.sql.Connection;


public class StudentDao {
	public static boolean insertStudenttoDB(Student st){
		boolean f =false;
		
		try {
			Connection con = CP.createC();
			String q="insert into student(sname,sphone,scity) value(?,?,?)";
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());

			pstmt.executeUpdate();
			f=true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return f;
	}

}
