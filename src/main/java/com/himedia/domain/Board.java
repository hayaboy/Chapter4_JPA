package com.himedia.domain;

import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Board
 *
 */
@Entity  // @Entity가 설정된 클래스를 엔티티라 하면, 기본적으로 클래스 이름과 동일한 테이블과 매핑
@Table(name = "BOARD3") //엔티티 이름과 매핑될 테이블 이름이 다른 경우, name 속성을 사용하여 매핑한다.동일하면 생략가능
public class Board  {

	@Id //테이블의 기본키를 매핑, 엔티티의 필수 어노테이션으로서 @Id가 없는 엔티티는 사용하지 못함
	@GeneratedValue // @Id가 선언된 필드에 기본 키 값을 자동으로 할당
	private Long seq;
	
	
	private String title;
	private String writer;
	private String content;
	private Date createDate;
	private Long cnt;
	




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
