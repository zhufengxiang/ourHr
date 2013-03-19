package Utils;

import java.util.Iterator;
import java.util.List;

import com.anping.po.Depart;
import com.ext.po.Depart4Ext;

public class CommandDepartUtil {
	  //将com.anping.po   转换为  com.ext.po
     public  Depart4Ext changeAnPingToExtPo(Depart anping){
    	 Depart4Ext    depart4Ext  = new Depart4Ext();
    	 depart4Ext.setId(anping.getId());
//          depart4Ext.setChecked(anping.getChecked()==1?true:false);
          depart4Ext.setExpandable(anping.getExpandable()==1?true:false);
          depart4Ext.setExpanded(anping.getExpanded()==1?true:false);
          depart4Ext.setLeaf(anping.getLeaf()==1?true:false);
          depart4Ext.setText(anping.getText());
          return  depart4Ext;
     }
      //将com.ext.po  转换为com.anping.po
     public  Depart  changeExtToAnPingPo(Depart4Ext depart4Ext){
    	 Depart    anping =  new Depart();
    	 anping.setId(depart4Ext.getId());
//    	 anping.setChecked(depart4Ext.isChecked()?1:0);
    	 anping.setExpandable(depart4Ext.isExpandable()?1:0);
    	 anping.setExpanded(depart4Ext.isExpanded()?1:0);
    	 anping.setLeaf(depart4Ext.isLeaf()?1:0);
    	 anping.setText(depart4Ext.getText());
    	 return  anping;
     }
     
     
     //这是将com.anping.po  中的Depart  的list  转换为Depart4Ext  的list
     public  void   changListToExtList(List<Depart>  departs, List<Depart4Ext> exts){
    	        Iterator<Depart>    i =  departs.iterator();
    	       
               while(i.hasNext()){
            	
            	   exts.add(this.changeAnPingToExtPo(i.next()));
               }
     }
}
