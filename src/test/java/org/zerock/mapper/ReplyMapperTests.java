package org.zerock.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTests {
	
	private Long[] bnoArr = { 1370L, 1371L, 1372L, 1373L, 1374L};
	
	@Setter(onMethod_=@Autowired)
	private ReplyMapper mapper;
	
	
	@Test
	public void testRead() {
		
		Criteria cri= new Criteria(2, 10);
		
		List<ReplyVO> replies = mapper.getListWithPaging(cri, 1370L);
		
		replies.forEach(reply -> log.info(reply));
	}

}
