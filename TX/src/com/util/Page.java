package com.util;

public class Page {
	private int start;
	private int end;
	private int currPage=1;
	private int pageSize=5;
	private int totalPage;
	private int totalCount;
	
	//��һҳ
	public int getShangyiye(){
		int tmp=currPage-1;
		if(tmp<=0){
			tmp=1;
		}
		return tmp;
	}
	//��һҳ
	public int getXiayiye(){
		int tmp=currPage+1;
		if(tmp>totalPage){
			return totalPage;
		}
		return tmp;
	}
	
	 //���� totalpage  ��ҳ�� 
	  //  ������/ÿҳ����
	    // ������%ÿҳ���� ��=0 
	public  void  setZongYeShu(int count){ 
		int tmppage=count/pageSize;
		  if(count%pageSize>0){
			  tmppage+=1;
		  }
		  this.totalPage=tmppage;//���� ��ҳ�� 
		  this.totalCount=count;//���� ������
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
