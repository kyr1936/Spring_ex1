package com.yr.s1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yr.board.BoardVO;

@Controller
@RequestMapping(value="/board/**") // /board/test/boardWrite  ** : 패키지 포함 하위 모든 것들
public class BoardController {
	
	@RequestMapping(value="boardSelect", method=RequestMethod.GET)
	public ModelAndView boardSelect(int num, ModelAndView mv) {
						// parameter 이름이 num인 것을 mapping 순서 상관 X 
						// Integer.parseInt
		System.out.println("num:" + num);
		mv.addObject("num", num);
		mv.setViewName("board/boardSelect"); // 리턴할 주소
		
		return mv;
	}
	
	
	//boardList 메서드명   board/boardList view 의 경로를 URL주소로 매핑
	@RequestMapping(value = "boardList", method = RequestMethod.GET)
	public Model boardList(Model model) {
		String result = "Change";
		String result2= "Another Data";
		BoardVO boardVO = new BoardVO();
		boardVO.setTitle("hi");
		
		model.addAttribute("result", result);
		model.addAttribute(boardVO);
		
		return model;
	}
	
	@RequestMapping(value = "boardWrite", method = RequestMethod.POST)
	public String boardWrite2(BoardVO boardVO) {
											 
		System.out.println(boardVO.getNum());
		System.out.println(boardVO.getTitle());
		System.out.println(boardVO.getWriter());
		System.out.println(boardVO.getContents());
		
		return "redirect:../?num=1";	
		// return "redirect:../?num=1";
		// redirect : 상대경로 또는 절대경로 
	}
	
	
	/* @RequestMapping(value = "boardWrite", method = RequestMethod.POST)
	public String boardWrite2(String[] check, @RequestParam(value="num", defaultValue="3", required = false) int n, String title, String writer, String contents) {
											// 파라미터명과 일치하지 않을 때	  // 파라미터가 넘어오지 않으면	// 파라미터를 넘겨주지 않아도 됨 
		System.out.println(n);
		System.out.println(title);
		System.out.println(writer);
		System.out.println(contents);
		
		for(String s:check) {
			System.out.println(s);
		}
		
		return "redirect:../?num=1";	
		// return "redirect:../?num=1";
		// redirect : 상대경로 또는 절대경로 
	}
	*/
	@RequestMapping(value="boardWrite", method = RequestMethod.GET)
	public String boardWrite() {
		return "board/boardWrite";
	}
}
