package hbmUtil;

import Utils.CheckEntity;

import com.anping.po.Depart;

 

public class Test {
    public static void main(String args[]){
    	CheckEntity  a  = new   CheckEntity();
    	a.serachNameFromXml(Depart.class);
    }
}
