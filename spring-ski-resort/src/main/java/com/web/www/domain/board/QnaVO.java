package com.web.www.domain.board;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class QnaVO {
	
	private long qnaNum; //글번호
	private long memberNum; //회원번호
	private String qnaWriter; //작성자
	private String qnaCategory; //범주(호텔,스키장,교통,결제 등등)
	private String qnaTitle; //글제목
	private String qnaContent; //내용
	private int qnaCount; //조회수
	private String qnaPwd; //글 비밀번호
	private long qnaAnsNum; //답변 글번호
	private String qnaIsok; //답변 여부
	private String qnaDel; //삭제 여부
	private String qnaRegAt; //글 작성일
	private String qnaModAt; //글 수정일
	private String qnaAnsRegAt; //답변 등록일

}