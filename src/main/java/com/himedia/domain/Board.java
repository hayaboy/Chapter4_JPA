package com.himedia.domain;

import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Board
 *
 */
@Entity  // @Entity가 설정된 클래스를 엔티티라 하면, 기본적으로 클래스 이름과 동일한 테이블과 매핑
@Table(name = "BOARD3") //엔티티 이름과 매핑될 테이블 이름이 다른 경우, name 속성을 사용하여 매핑한다.동일하면 생략가능, uniqueConstraints 결합 unique 제약조건을 지정, 여러개의 칼럼이 결합되어 유일성을 보장(복합키)해야 하는 경우 사용   예) @UniqueConstraint(columnNames={"EMP_ID", "EMP_NAME"})
public class Board  {

	@Id //테이블의 기본키를 매핑, 엔티티의 필수 어노테이션으로서 @Id가 없는 엔티티는 사용하지 못함
	@GeneratedValue(strategy = GenerationType.AUTO)// @Id가 선언된 필드에 기본 키 값을 자동으로 할당 // strategy = GenerationType.AUTO 하이버네이트가 데이터베이스에 맞는 PK값 생성전략을 선택, 생성전략은 TABLE, SEQUENCE(시퀀스를 지원하는 데이터베이스에서만 사용),IDENTITY(auto_increment를 이용하여 PK값을 생성한다. 주로 MySQL에서 사용)
	private Long seq;             //generator  이미 생성된 키 생성기를 참조함
	
	
	
	
	private String title;
	private String writer;
	private String content;
	
	
	@Temporal(TemporalType.DATE) // java.util.Date 타입의 날짜 데이터를 매핑할 때 사용
	private Date createDate;
	
	
	private Long cnt;
	

//	@Transient  // 매핑되는 칼럼이 없거나 검색 관련 변수같이 임시로 사용되는 변수들은 아예 매핑에서 제외해야 하는 경우에 사용
//	private String searchCondition;



	public Long getSeq() {
		return seq;
	}


	public void setSeq(Long seq) {
		this.seq = seq;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	public Long getCnt() {
		return cnt;
	}


	public void setCnt(Long cnt) {
		this.cnt = cnt;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Board [seq=" + seq + ", title=" + title + ", writer=" + writer + ", content=" + content
				+ ", createDate=" + createDate + ", cnt=" + cnt + "]";
	}
	
	
	
	
   
}
