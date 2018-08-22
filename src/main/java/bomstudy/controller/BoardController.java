package bomstudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import bomstudy.domain.Board;
import bomstudy.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired BoardService boardService;

	@RequestMapping("list")
	public String list(Model model) throws Exception {
		model.addAttribute("list", boardService.list());
		
		return "board/list";
	}
	
	@GetMapping("form")
	public void form() {
	}

	
	@PostMapping("add")
	public String add(Board board) throws Exception {
		boardService.add(board);
		return "redirect:list";
	}
	
	@RequestMapping("{no}")
	public String view(@PathVariable String no, Model model) throws Exception {
		Board board = boardService.get(no);
		model.addAttribute("board", board);
		return "board/view";
	}
	
	@RequestMapping("update")
	public String update(Board board) throws Exception {
		boardService.update(board);
		return "redirect:list";
	}
	
	@RequestMapping("delete")
	public String delete(String no) throws Exception {
		boardService.delete(no);
		return "redirect:list";
	}
    
	
}
