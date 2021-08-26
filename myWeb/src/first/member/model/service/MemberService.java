package first.member.model.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

import first.common.JDBCTemplate;
import first.member.model.dao.MemberDao;
import first.member.model.vo.MemberVo;

public class MemberService {


	public MemberService() {	
	}
	public int login(String id,String passwd) {
		int result=-1;
		Connection conn=JDBCTemplate.getConnection();		
		JDBCTemplate.close(conn);
		
		return result;
	}
	
	public ArrayList<MemberVo> selectList(){
		ArrayList<MemberVo> volist=null;
		Connection conn=null;
		
		conn=JDBCTemplate.getConnection();
		
		volist= new MemberDao().selectList(conn);
		JDBCTemplate.close(conn);
		return volist;
	}
	public ArrayList<MemberVo> searchSelectList(String name){
		ArrayList<MemberVo> volist=null;
		Connection conn=JDBCTemplate.getConnection();
		volist= new MemberDao().searchSelectList(conn,name); 
		JDBCTemplate.close(conn);
		return volist;
	}
	
	public int inputMember(MemberVo vo) {
		int result=-1;
		Connection conn=JDBCTemplate.getConnection();		
		result=new MemberDao().inputMember(conn, vo);
		return result;
	}
	public int deleteMember(String id) {
		int result=-1;
		 Connection conn=JDBCTemplate.getConnection();		
		result=new MemberDao().deleteMemeber(conn, id);
		return result;
	}
	public int updateMember(String id,String passwd) {
		int result=-1;
		Connection conn=JDBCTemplate.getConnection();		
		result=new MemberDao().updateMember(conn,id,passwd );
		return result;
	}
}
