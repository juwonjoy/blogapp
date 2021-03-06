package com.cos.blogapp.domain.board;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//테이블 모델
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Board {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; //PK(자동증가 번호)
	private String  title;  //아이디 
	private String content; 

	
}
