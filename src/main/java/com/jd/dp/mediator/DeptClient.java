package com.jd.dp.mediator;

public class DeptClient {

	public static void main(String[] args) {
		
		DeptMediator president=new President();
		
		/**
		 * 研发部：负责研发工作！
			研发部：请求财务部配合！
			财务部：负责财务工作！
		 */
        Development devp=new Development(president);
        Finacial fin=new Finacial(president);
        Market mar=new Market(president);
        
       
        devp.ownWork();
        devp.outWork();   

	}

}
