package org.ojsag.sgms;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/{groupNo}/board")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@RequestMapping({"/", "/list"})
	public String home(@PathVariable("groupNo") int groupNo, HttpServletRequest req, Model model) {
		
		int pageNum = 1;
		try {
			pageNum = Integer.parseInt(req.getParameter("pageNum"));
		} catch (Exception e) {}
		
		logger.info("gno: " + groupNo);
		logger.info("page: " + pageNum);
		// �̷������� ������ gruopNo�� ���κ��� �����ͼ� üũ�� �� ������?
		// AOP: ��Ʈ�ѷ� ������ ��? or ���� ������?
		
		return "/board/list";
	}
	
}
