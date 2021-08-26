package first.member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import first.member.model.vo.MemberVo;

public class MemberDao {

	public MemberDao() {		
	}
	
	//로그인 id,passwd 가지고 오면 sql
	//로그인 성공, 로그인 실패- id가 없어서,pw가 틀려서,id가 틀려서,
	/*
	 * return: 0 -id,pwd일치, 1-id만 일치, 2-id없음, -1 오류발생
	 */
	public int login(Connection conn,String id,String passwd) {
		int result=-1;
//		String sql="select id,passwd *from TEST_MEMBER where id=? and passwd=?";
		String sql="select passwd from TEST_MEMBER where id=?";
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
//			pstmt.setString(2, passwd);
			ResultSet rs=pstmt.executeQuery();
			
			if(rs.next()) {
				//성공
				//id 있음
				String dbPwd=rs.getString(1);
				if(passwd.contentEquals(dbPwd)) {
					//비밀번호도 같음-->로그인 성공
					result=0;
				}
				else {
					result= 1;
				}
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public ArrayList<MemberVo> selectList(Connection conn) {
		ArrayList<MemberVo> volist=null;
		
		String sql="select * from TEST_MEMBER";
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			
			volist=new ArrayList<MemberVo>();
			
			while(rs.next()) {
				MemberVo vo=new MemberVo();
				vo.setId(rs.getString("id"));
				vo.setPasswd(rs.getString("passwd"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
				
				volist.add(vo);
			}
		rs.close();
		pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return volist;
	}
	//TEST_MEMBER table에 검색한 결과 리스트
	public ArrayList<MemberVo> searchSelectList(Connection conn,String name){
		ArrayList<MemberVo> volist=null;
		String sql="select * from TEST_MEMBER where name=?";
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,name);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {  //if~~~do~while 많이씀
			volist=new ArrayList<MemberVo>();
			do {    
				MemberVo vo=new MemberVo();
				vo.setName(rs.getString("name"));
				vo.setId(rs.getString("id"));
				vo.setPasswd("passwd");
				vo.setEmail("email");
				
				volist.add(vo);
			}while(rs.next());
			}
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return volist;
	}
	
	//TEST_MEMBER table에 insert
	public int inputMember(Connection conn,MemberVo vo) {
		int result=-1;
		String sql="insert into TEST_MEMBER(id,passwd,name,email) values(?,?,?,?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,vo.getId());
			pstmt.setString(2, vo.getPasswd());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getEmail());
			result=pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("추가 성공");
			} else {
				System.out.println("추가 실패");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return result;
	}
	
	//TEST_MEMBER table에 delete
	public int deleteMemeber(Connection conn,String id) {
		int result=-1;
		String sql="delete from TEST_MEMBER where id=?";
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			result=pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	///TEST_MEMBER table에 update
	public int updateMember(Connection conn,String id,String passwd) {
		int result=-1;    //초기 값을 음수로 두어서 sql문 의 정상 수행 후 결과가 0인 것과 오류 발생으로 인한 결과값을 구분하기 위해서(오류발생시 -1 반환)
		String sql="update TEST_MEMBER set where id=?,passwd=?";
		try {
			PreparedStatement pstmt=conn.prepareCall(sql);
			pstmt.setString(1, id);
			pstmt.setNString(2, passwd);
			result=pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
