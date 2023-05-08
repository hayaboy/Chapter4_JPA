package com.himedia;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.himedia.domain.Board;





public class JPAClient {
	
	
	public static void main(String[] args) {
		
		// EntityManager 생성
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("Chapter04");
		
		
		
		//JPA를 이용하여 실질적인 CRUD 기능을 처리하려면 EntityManager 객체를 사용. 그 객체의 persist()메서드를 이용하여 Board 엔티티에 설정된 값을 BOARD 테이블에 저장함
		EntityManager em=emf.createEntityManager();	
		
		//JPA가 실제 테이블에 등록/수정/삭제 작업을 처리하기 위해서는 해당 작업이 반드시 트랜잭션 안에서 수행되어야 한다. 
				//만약 트랜잭션을 시작하지 않았거나 등록/수정/삭제 작업 이후에 트랜잭션을 종료하지 않으면 요청한 작업이 실제 데이터베이스에 반영되지 않는다.
				// Transaction 생성
		EntityTransaction tx = em.getTransaction();
		
		try {
			
			
//			tx.begin(); zzzkkk
//			Board board=new Board();
//			board.setTitle("JPA 제목2");
//			board.setWriter("관리자2");
//			board.setContent("JPA 글 등록 잘 되네요2");
//			board.setCreateDate(new Date());
//			board.setCnt(0L);
			
			//데이터를 조회할 때는 EntityManager의 find()메소드를 사용
			//다만 검색작업은 트랜잭션과 관련이 없기 때문에 트랜잭션 관련 소스는 생략해도 됨
			
			
			//글 등록
//			em.persist(board); // 영속한다.(비휘발성저장, insert)
//			tx.commit();
			
			
			//글 상세 조회
			Board searchBoard=em.find(Board.class, 1L);
			System.out.println("---->" + searchBoard.toString());
			Board searchBoard2=em.find(Board.class, 2L);
			System.out.println("---->" + searchBoard2.toString());
		
		}catch(Exception e) {
			e.printStackTrace();			
			// Transaction rollback
			tx.rollback();
		}finally {
			em.close();
			emf.close();
		}
		
		
		
	}

}
