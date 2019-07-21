package com.woms.maven.entity;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
/**
 * 
 * @author wms
 *
 * @date Jul 10, 2019
 */
@Data
@AllArgsConstructor
public class Pageable<T> {
	
	private Integer pageIndex;
	
	private Integer pageCount;
	
	private Integer totalCount;
	
	private List<T> list;
	
	


	

}
