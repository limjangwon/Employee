package com.hybrid.mapper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.hybrid.model.Member;

public class MemberMapperTest {
	private static Log log;


	public static void main(String[] args) throws Exception {
	
		Log log = LogFactory.getLog(MemberMapperTest.class);
		
		String driverClassName="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="scott";
		String password="tiger";
		
		/*
		 * DataSource
		 */
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(dataSource);
		
		ClassPathResource memberMapper = new ClassPathResource("com/hybrid/mapper/MemberMapper.xml");
		Resource[] mapperLocations = {memberMapper};
		sqlSessionFactory.setMapperLocations(mapperLocations);
		
		/*
		 * SqlSessionTemplate
		 */
		SqlSessionTemplate sqlSession = new SqlSessionTemplate(sqlSessionFactory.getObject());
		
		
		MemberMapper mapper =sqlSession.getMapper(MemberMapper.class);
		List<Member> list = mapper.selectAll();
		
//		List<Member> list = sqlSession.selectList("com.hybrid.mapper.MamberMapper.selectAll");
		
		
			for (Member m : list) {
			log.info("id = " + m.getId());
			log.info("email = " + m.getEmail());
			log.info("name = " + m.getName());
			log.info("password = " + m.getPassword());
			log.info("registerdate = " + m.getRegisterDate());
		}
		
//		printMembers(dataSource.getConnection());
		
		log.info("Program exit...");
		
	}


	static void printMembers(Connection con) throws SQLException {
		String sql ="select * from member";
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		List<Member> list = new ArrayList<>();
		
		while(rs.next()) {
			Member m = new Member();
			m.setId(rs.getLong("id"));
			m.setEmail(rs.getString("email"));
			m.setName(rs.getString("Name"));
			m.setPassword(rs.getString("Password"));
			m.setRegisterDate(rs.getDate("register_date"));
			
			list.add(m);
		
		}
		
		for (Member m : list) {
			
			log.info("id = " + m.getId());
			log.info("email = " + m.getEmail());
			log.info("name = " + m.getName());
			log.info("password = " + m.getPassword());
			log.info("registerdate = " + m.getRegisterDate());
		}
	}
	
}