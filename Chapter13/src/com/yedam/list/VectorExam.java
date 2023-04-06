package com.yedam.list;

import java.util.List;
import java.util.Vector;

public class VectorExam {
	public static void main(String[] args) {
		
		List<Board> list = new Vector<>();
		
		
		Board board = new Board("제목1", "내용1", "글쓴이1");
		list.add(board);
		
		//위두줄 합치는 방법
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		list.add(new Board("제목6", "내용6", "글쓴이6"));

		
		
		
		//첫번째 방법
		System.out.println("========첫번째 방법====");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));	
			System.out.print(list.get(i).subject+" ");
			System.out.print(list.get(i).content+" ");
			System.out.println(list.get(i).writer);
			
		}

		
		//두번째방법- 향상된for문 활용
		System.out.println("=========두번째 방법====");
			for(Board board2 : list) {
				System.out.println(board2.subject +"\t" 	
								+ board2.content +"\t" 	
								+ board2.writer);
			}
			
			
			
		
		
				
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
