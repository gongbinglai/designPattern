package com.jd.dp.mediator;

/**
 * 抽象同事角色
 * @author gongbinglai
 *
 */
public class ColleagueB extends AbstractColleague{

	 public void setNumber(int number, AbstractMediator am) {    
         this.number = number;    
         am.BaffectA();    
     }    

}
