package com.util;

public class Page {
	private int start;
	private int end;
	private int currPage=1;
	private int pageSize=5;
	private int totalPage;
	private int totalCount;
	
	//上一页
	public int getShangyiye(){
		int tmp=currPage-1;
		if(tmp<=0){
			tmp=1;
		}
		return tmp;
	}
	//下一页
	public int getXiayiye(){
		int tmp=currPage+1;
		if(tmp>totalPage){
			return totalPage;
		}
		return tmp;
	}
	
	 //设置 totalpage  总页数 
	  //  总条数/每页条数
	    // 总条数%每页条数 ！=0 
	public  void  setZongYeShu(int count){ 
		int tmppage=count/pageSize;
		  if(count%pageSize>0){
			  tmppage+=1;
		  }
		  this.totalPage=tmppage;//设置 总页数 
		  this.totalCount=count;//设置 总条数
	}
	
	
	
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getCurrPage() {
		return currPage;
	}
	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	
	
}
